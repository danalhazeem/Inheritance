package company;

import java.util.ArrayList;
import java.util.List;

public class Engineer extends Employee {
    private List<String> skills;

    public Engineer(String name, String department, double salary) {
        super(name, department, salary);
        this.skills = new ArrayList<>();
    }

    // Getter and method to add a skill
    public List<String> getSkills() {
        return skills;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    @Override
    public String toString() {
        return super.toString() + ", Skills: " + skills;
    }
}