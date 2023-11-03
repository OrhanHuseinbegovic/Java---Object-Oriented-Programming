package Week6Lecture.Polymorphism;

public class Main {
    public static void main(String[] args){
        Mouse mouse = new Mouse();
        // mouse.makeSound();

        Animal animal = new Animal();
        // animal.makeSound();

        Tiger tiger = new Tiger();

        doSomethingCrazy(mouse);
        doSomethingCrazy(animal);
        doSomethingCrazy(tiger);
    }

    public static void doSomethingCrazy(Animal animal){
        if (animal instanceof Tiger){
            Mouse m = (Mouse) animal; //putting to be parent class but sending child class
            System.out.println(m.amIAMouse());
        }
    }

    //method overriding methodoverloading is core of polymorphism
}
