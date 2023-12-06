package Week10.Lab.Task2;

import java.util.Arrays;

public class Student {
    private String name;
    private String ID;
    private int[] grades;

    public Student(String name, String ID, int[] grades) {
        this.name = name;
        this.ID = ID;
        this.grades = grades;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void printInfo(){
        System.out.println("NAME: "+this.name+" ID: "+this.ID+" GRADES: "+Arrays.toString(this.grades));
    }
}
