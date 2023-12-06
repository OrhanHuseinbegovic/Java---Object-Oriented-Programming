package Week10.Lab.Task2;

import java.util.List;

public class GradeAnalyzer {
    private List<Integer> listOfGrades;

    GradeAnalyzer(List<Integer> listOfGrades){
        this.listOfGrades= listOfGrades;
    }

    public double calculate(){
        int sum = 0;
        int count = this.listOfGrades.size();
        for(Integer value : listOfGrades){
            sum = sum + value;
        }
        double average = (double) sum / (double) count;
        return average;
    }
    public void print() {
        System.out.println("Grade Summary:");
        System.out.println("Grades: " + listOfGrades);
        System.out.println("Average Grade: " + calculate());
    }
}
