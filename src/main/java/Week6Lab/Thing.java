package Week6Lab;

import java.lang.reflect.Constructor;

public class Thing {
    String name;
    double weight;
    Thing(String name, double weight){
        if(weight<0){
            throw new IllegalArgumentException("Optional error message");
        }
        else{
            this.weight=weight;
        }

        this.name = name;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }

    Thing(String name){
        this.name=name;
    }
    public void equals(){

    }

    public void contains(){

    }

}
