package Week11.Lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {
    private List<Student> listOfStudents;
    public StudentSystem(String fileName){
        try{
            listOfStudents = readStudents(fileName);
        }catch (IOException e){
            System.out.println("Unable to load a file");
        }
    }

    public List<Student> readStudents(String nameOfFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new FileReader(nameOfFile)
        );
        List<Student> listOfAllStudents = new ArrayList<>();
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for(String line : lines){
            String[] parsedLine = line.split(",");
            Student temp = new Student(
                    parsedLine[0] != "" ? Integer.parseInt(parsedLine[0]) : 0,
                    parsedLine[1],
                    parsedLine[2],
                    parsedLine[3],
                    parsedLine[4] != "" ? Double.parseDouble(parsedLine[4]) : 0
            );
            listOfAllStudents.add(temp);
        }
        bufferedReader.close();
        return listOfAllStudents;
    }

    public void printStudentDetails() throws IOException {
        List<Student> students = readStudents("students.csv");
        for (Student student : students){
            student.printStudentInfo();
        }
    }

    public Optional<Student> getStudentById(int id) throws IOException {
        List<Student> students = readStudents("students.csv");
        Student studentOptional = null;
        for(Student student : students){
            if(student.getId()==id){
                studentOptional = student;
            }
        }
        return Optional.of(studentOptional);
    }

    public Optional<Student> getHighestGPAStudent() throws IOException, EmptyStudentListException {
        List<Student> students = readStudents("students.csv");
        if (students.isEmpty()){
            throw new EmptyStudentListException("List of students is empty");
        }
        double highestGPA = 0.0;
        Student highestGPAStudent = null;
        for (Student student : students){
            if(student.getGpa()>highestGPA){
                highestGPAStudent = student;
            }
        }
        return Optional.of(highestGPAStudent);
    }

    public Optional<Student> getLongestNameStudent() throws IOException, EmptyStudentListException{
        List<Student> students = readStudents("students.csv");
        if (students.isEmpty()){
            throw new EmptyStudentListException("List of students is empty");
        }
        int longestName = 0;
        Student longestNameStudent = null;
        for (Student student : students){
            if(student.getName().length()>longestName){
                longestName = student.getName().length();
                longestNameStudent = student;
            }
        }
        return Optional.of(longestNameStudent);
    }
}
