package VjezbaZaGit;

public class Student extends Person{
    private int studentId;
    private int studentYear;

    public Student(String name, String surname, int age, Gender gender, int studentId, int studentYear) {
        super(name, surname, age, gender);
        this.studentId = studentId;
        this.studentYear = studentYear;
    }

    public void getYearAndId(){
        getNameAndSurname();
        System.out.println("ID: "+this.getStudentId()+" Year: "+this.getStudentYear());
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public void sayPerson(){
        System.out.println("This would be said in STUDENT CLASS???");
    }
}
