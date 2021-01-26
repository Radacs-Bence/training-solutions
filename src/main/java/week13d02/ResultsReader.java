package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class ResultsReader {

    public static final String SEPARATOR = " ";
    public static final String SKIP = "X";

    private String answerKey;
    private List<Question> questions = new ArrayList<>();

    public ResultsReader(InputStream inputStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line = reader.readLine();
            this.answerKey = line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(SEPARATOR);
                questions.add(questionMaker(parts));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

    private Question questionMaker(String[] parts) {
        int index = 1;
        if (!questions.isEmpty()) {
            for (Question question : questions) {
                if (parts[0].equals(question.getId())) {
                    index = question.getIndex() + 1;
                }
            }
        }
        return new Question(parts[0], parts[1], index);
    }

    public boolean isCorrect(String id, int index) {
        boolean correct = false;
        for (Question question : questions) {
            if (question.getId().equals(id)
                    && question.getIndex() == index
                    && answerKey.substring(index - 1, index).equals(question.getAnswer())) {
                correct = true;
            }
        }
        return correct;
    }

    public boolean isCorrect(Question question) {
        return isCorrect(question.getId(), question.getIndex());
    }

    public String mostX() {
        Map<String, Integer> counter = new TreeMap<>();
        for (Question question : questions) {
            if (SKIP.equals(question.getAnswer())) {
                if (!counter.containsKey(question.getId())) {
                    counter.put(question.getId(), 1);
                } else {
                    int num = counter.get(question.getId());
                    counter.put(question.getId(), num + 1);
                }
            }
        }
        return findMax(counter);
    }

    public String winner() {
        Map<String, Integer> counter = new TreeMap<>();
        for (Question question : questions) {
            if (!counter.containsKey(question.getId())) {
                counter.put(question.getId(), 0);
            } else {
                int num = counter.get(question.getId());
                counter.put(question.getId(), num + questionPoints(question));
            }
        }
        return findMax(counter);
    }

    private String findMax(Map<String, Integer> counter) {
        String id = questions.get(0).getId();
        for (String name : counter.keySet()) {
            if (counter.get(id) < counter.get(name)) {
                id = name;
            }
        }
        return id;
    }

    private int questionPoints(Question question) {
        int points = 0;
        if (isCorrect(question)) {
            points = question.getIndex();
        } else if (!SKIP.equals(question.getAnswer())) {
            points = -2;
        }
        return points;
    }


}
