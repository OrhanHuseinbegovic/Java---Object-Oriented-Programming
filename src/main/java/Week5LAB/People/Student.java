package Week5LAB.People;

public class Student extends Person{
    int credits = 0;
    private int studentId;
    int grades;
    public Student(String nameSurname, String livingAdress) {
        super(nameSurname, livingAdress);
    }



    public int addGrade(int addGr){
        return this.grades += addGr;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int study(){
        this.credits++;
        return this.credits;
    }

    public int getCredits() {
        return credits;
    }
    @Override
    public String toString(){
        return this.nameSurname + "\n "+ this.livingAdress + "\n credits: " + this.getCredits();
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}


enum studies{
    YES, NO
}
