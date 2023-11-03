package Week6Lecture.Polymorphism;

public class Animal {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String makeSound(){
        return "ANIMAL SOUND";
    }
    //method overloading , two same methods but diff parameters
    public String makeSound(String myAnimalSound){
        return "POLYMORPHIC ANIMAL SOUND";
    }
}
