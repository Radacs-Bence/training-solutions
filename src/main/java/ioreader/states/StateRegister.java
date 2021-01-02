package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public List<State> getStates() {
        return new ArrayList<>(states);
    }

    public void readStatesFromFile(String fileName) {
        Path file = Path.of("src/main/resources/" + fileName);

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("-");
                states.add(new State(parts[0], parts[1]));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can't read file!", ioException);
        }
    }

    public String findCapitalByStateName(String stateName) {
        State foundState = null;
        for (State state : states) {
            if (state.getStateName().equals(stateName)){
                foundState = state;
            }
        }
        if (foundState == null){
            throw new IllegalArgumentException("No state with this name!");
        }
        return foundState.getCapital();
    }

}
