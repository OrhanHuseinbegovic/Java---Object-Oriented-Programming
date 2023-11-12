package ExercisesForQuizThree3;

public class Person {
    private String name;
    private String surname;
    private MyDate dateOfBirth;
    private int weight;
    private int height;

    Person(String name, String surname, int day, int month, int year){
        this.name=name;
        this.surname=surname;
        this.weight = 0;
        this.height = 0;
        this.dateOfBirth=new MyDate(day,month,year);
    }

    Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: "+this.name+"\nSurname: "+this.surname+"\nBirthdate: "+this.dateOfBirth;
    }

    public void setHeight(int height){
        this.height=height;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getHeight(){
        return this.height;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public double weightIndex(){
        double heightInMeters = this.height/100.0;
        return this.weight/(heightInMeters*heightInMeters);
    }
}
