package lambdaintro;

import java.util.ArrayList;
import java.util.List;

public class Member {


    private final String name;
    private final Sex gender;
    private List<String> skills;
    private List<String> messages = new ArrayList<>();

    public Member(String name, List<String> skills, Sex gender) {
        this.name = name;
        this.gender = gender;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public Sex getGender() {
        return gender;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }

    public List<String> getMessages() {
        return new ArrayList<>(messages);
    }

    public void sendMessage(String message) {
        messages.add(message);
    }

}
