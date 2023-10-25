package Week5LAB.People;

public class Teacher extends Person{
    int salary;

    public Teacher(String nameSurname, String livingAdress, int salary) {
        super(nameSurname, livingAdress);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.nameSurname + "\n "+ this.livingAdress + "\n salaray " + this.getSalary() + " euros/month";
    }
}
