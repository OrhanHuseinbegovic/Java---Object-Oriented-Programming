package ExercisesQuiz3;

abstract class Animal{
    private String name;
    private int years;

    public Animal(String name, int years){
        this.name=name;
        this.years=years;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setYears(int years){
        this.years=years;
    }

    public String getName(){
        return this.name;
    }
    public int getYears(){
        return this.years;
    }

    public String sayAnimalThing(){
        return "THIS IS ANIMAL THING";
    }
}

class Cat extends Animal{
    int catLifes;

    Cat(String name, int years, int catLifes){
        super(name,years);
        this.catLifes=catLifes;
    }

    @Override
    public String sayAnimalThing(){
        return "MEOW MEOW";
    }

}

class Dog extends Animal{
    String dogBarks;

    Dog(String name, int years, String dogBarks){
        super(name, years);
        this.dogBarks=dogBarks;
    }

    @Override
    public String sayAnimalThing(){
        return "AW AW";
    }
}

class SomeClass <T> extends Animal{
    private T something;

    SomeClass(String name, int years, T something){
        super(name, years);
        this.something=something;
    }

    public void setSomething(T something){
        this.something=something;
    }

    public T getSomething(){
        return this.something;
    }
}
