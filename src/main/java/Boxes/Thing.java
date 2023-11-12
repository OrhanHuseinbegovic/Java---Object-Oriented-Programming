package Boxes;

import java.util.Objects;

public class Thing {
    private double weight;
    private String name;

    Thing(String name){
        this.name=name;
    }
    Thing(String name, double weight){
        if(weight<0){
            throw new IllegalArgumentException("Weight must be positive!");
        }
        else{
            this.weight=weight;
            this.name=name;
        }
    }

    /*
     Also implement the methods equals in the class Thing,
      allowing you to use the contains method of different lists
      and collections. Implement the methods without taking into consideration
       the value of the object variable weight.
     */
    @Override
    public boolean equals(Object object){
        if(getClass()!=object.getClass()){
            return false;
        }
        Thing thing = (Thing) object;
        return Objects.equals(name,thing.name);
    }

    public double getWeight(){
        return this.weight;
    }
}
