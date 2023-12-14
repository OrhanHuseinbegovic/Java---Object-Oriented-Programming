package Week11.Lab;

public class Student {
    private int id;
    private String name;
    private String universityName;
    private String department;
    private double gpa;

    public Student(int id, String name, String universityName, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.universityName = universityName;
        this.department = department;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return "Name: "+this.name;
    }

    public void printStudentInfo(){
        System.out.println("ID: "+this.getId()+" Name: "+this.getName()+" University: "+this.getUniversityName()+" Department: "+this.getDepartment()+" GPA: "+this.getGpa());
    }
}
