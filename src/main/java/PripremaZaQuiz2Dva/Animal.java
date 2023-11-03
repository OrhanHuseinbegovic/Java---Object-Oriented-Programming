package PripremaZaQuiz2Dva;


class Animal{
    private String name;
    private int age;
    private Color color;

    //GETTERS AND SETTERS
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Color getColor(){
        return this.color;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setColor(Color color){
        this.color=color;
    }

    //CONSTRUCTOR
    Animal(String name){
        this.name = name;
    }

    //CONSTRUCTOR
    Animal(int age){
        this.age = age;
    }

    //CONSTRUCTOR
    Animal(String name, int age, Color color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String runSound(){
        return "Animal running";
    }

}

class Tiger extends Animal{
    int numOfTeeth;

    //GETTERS AND SETTERS
    public int getNumOfTeeth(){
        return this.numOfTeeth;
    }
    public void setNumOfTeeth(int numoft){
        this.numOfTeeth = numoft;
    }

    //CONSTRUCTOR
    Tiger(String name, int age, Color color, int numof){
        super(name,age,color);
        this.numOfTeeth=numof;
    }

    @Override
    public String runSound(){
        return "Tiger running";
    }
}

class Lion extends Animal{
    int bearLength;

    //GETTERS AND SETTERS
    public int getBearLength(){
        return this.bearLength;
    }
    public void setBearLength(int lent){
        this.bearLength = lent;
    }

    //CONSTRUCTOR
    Lion(String name, int lent){
        super(name);
        this.bearLength = lent;
    }

    @Override
    public String runSound(){
        return "Lion running";
    }
}

enum Color{
    BLACK, WHITE, RED, GREEN
}

class Main{
    public static void main(String[] args){
        Animal animal = new Animal("Scary animal", 3, Color.RED);
        Tiger tiger = new Tiger ("Tony", 5, Color.WHITE, 30);
        Lion lion = new Lion("Mufasa", 50);

        System.out.println(animal.runSound());
        System.out.println(tiger.runSound());
        System.out.println(lion.runSound());

    }
}
