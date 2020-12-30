package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private List<Human> humans = new ArrayList<>();
    private Path myFile;


    public FileManager(String filepath) {
        this.myFile = Path.of(filepath);
    }

    public void readFromFile() {
        List<String> names = null;
        try {
            names = Files.readAllLines(myFile);
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
        this.humans = namesListConverter(names);
    }

    private List<Human> namesListConverter(List<String> names) {
        List<Human> people = new ArrayList<>();
        for (String name : names) {
            people.add(nameToHuman(name));
        }
        return people;
    }

    private Human nameToHuman(String name) {
        String[] nameParts = name.split(" ");
        return new Human(nameParts[0], nameParts[1]);
    }

    public List<Human> getHumans() {
        return List.copyOf(humans);
    }

    public Path getMyFile() {
        return myFile;
    }
}