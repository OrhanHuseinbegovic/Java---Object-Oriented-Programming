package Week6Lecture;

public class Dog extends Animal implements  AnimalAbility, AnotherAnimalAbility{ //baca error jer hoce il da buse abstraktno ili da ima metodu
    @Override
    public  String saySomething(){
        return null;
    }

    public Dog(int numOfLegs){
        super(numOfLegs);
    }

    @Override
    public String walk() {
        return null;
    }
}

//final and static --> interface


// private attributes, public get and set method  --> every class