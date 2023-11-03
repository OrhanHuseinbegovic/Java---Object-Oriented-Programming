package Week6Lecture;

abstract class Animal {
    //abstract class and class are diff.
    //abstract class i that you can not instantiate abstract class
    //in abstract class you can have abstract and non-abstract methods
    /*

     */
    private int numOfLegs;
    public String sayHello(){
        return "HELLO"; //nonabstract method
    }
    public abstract String saySomething(); //interface tj abstract method ne moze imat implementaciju, samo skelet
    public Animal(int legs){
        this.numOfLegs = legs;
    }

}

class Main{
    public static void main(String[] args){

    }
}