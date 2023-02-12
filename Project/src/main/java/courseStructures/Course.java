package courseStructures;

import java.util.ArrayList;

public class Course {
    private String full_code;
    private String code;
    private String name;
    private int level;
    private String faculty;
    private double credit;
    private String description;
    private ArrayList<Course> prerequisites;

    public Course(String code, String name, String description) {
        this.full_code = code;
        this.code = code.substring(3, code.length()-5);
        this.name = name;
        this.level = Character.getNumericValue(code.charAt(code.length()-9));
        this.faculty = code.substring(0, 2);
        this.credit = Character.getNumericValue(code.charAt(code.length()-4));
        this.description = description;
        this.prerequisites = new ArrayList<Course>();
    }

    public String getFullCode() {
        return full_code;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code.substring(3, code.length()-5);
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(String code){
        char c = code.charAt(code.length()-10);
        int level = Character.getNumericValue(c);
        this.level = level;
    }

    public String getFaculty(){
        return faculty;
    }

    public void setFalulty(String code) {
        this.faculty = code.substring(0, 2);
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(String code) {
        char c = code.charAt(code.length()-2);
        this.credit = Character.getNumericValue(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }

    public void addPrerequisite(Course prereq)
    {
        if (!prerequisites.contains(prereq))
        {
            this.prerequisites.add(prereq);
        }
    }

    public void setPrerequisites(ArrayList<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }




}
