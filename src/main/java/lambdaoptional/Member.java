package lambdaoptional;

import java.util.ArrayList;
import java.util.List;

public class Member {


    private final String name;
    private final Sex gender;
    private List<String> skills;

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

}
