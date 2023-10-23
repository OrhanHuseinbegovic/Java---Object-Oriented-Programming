package VjezbaZaGit;

public class Person {
    //ATTRIBUTES
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    //CONSTRUCTOR
    public Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) throws Exception {
        if ((this.age<0)){
            throw new Exception("Wrong input!");
        }
        else if (this.age>90){
            throw new Exception("Wrong input!");
        }
        this.age = age;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void getNameAndSurname(){
        System.out.println("Name: "+this.getName()+" Surname: "+this.getSurname());
    }

    public void sayPerson(){
        System.out.println("This would be said in PERSON CLASS");
    }
}

enum Gender{
    MALE, FEMALE
}
