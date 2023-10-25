package Week5LAB.People;

public class Person {
    String nameSurname;
    String livingAdress;

    private int age;
    private String country;

    public Person(String nameSurname, String livingAdress) {
        this.nameSurname = nameSurname;
        this.livingAdress = livingAdress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getLivingAdress() {
        return livingAdress;
    }

    public void setLivingAdress(String livingAdress) {
        this.livingAdress = livingAdress;
    }

    @Override
    public String toString(){
        return this.nameSurname + "\n "+ this.livingAdress;
    }
}
