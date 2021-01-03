package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {

    private List<Production> productions = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();

    public List<Production> getProductions() {
        return new ArrayList<>(productions);
    }

    public List<Vote> getVotes() {
        return new ArrayList<>(votes);
    }

    public void readTalents(Path file) {
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                productions.add(new Production(Long.parseLong(parts[0]), parts[1]));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not open file!", ioException);
        }
    }

    public void calculateVotes(Path file) {
        createVotesByProduction();
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                voteCounter(line);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not open file!", ioException);
        }
    }

    private void createVotesByProduction() {
        for (Production production : productions) {
            votes.add(new Vote(production.getId(), 0));
        }
    }

    private void voteCounter(String id) {
        for (Vote vote : votes) {
            if (Long.parseLong(id) == vote.getId()) {
                vote.incNum();
            }
        }
    }

    public void writeResultToFile(Path file) {
        Vote winner = findWinner();
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for (Vote vote : votes) {
                writer.println(String.format("%d %s %d", vote.getId(), nameFinder(vote), vote.getNumber()));
            }
            writer.println("Winner: " + nameFinder(winner));
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not create file!", ioException);
        }
    }

    private Vote findWinner() {
        Vote winner = new Vote(0,-1);
        for (Vote vote : votes) {
            if (vote.getNumber() > winner.getNumber()){
                winner = vote;
            }
        }
        return winner;
    }

    private String nameFinder(Vote vote) {
        String name = "";
        for (Production production : productions) {
            if (vote.getId() == production.getId()) {
                name = production.getName();
            }
        }
        return name;
    }

}
