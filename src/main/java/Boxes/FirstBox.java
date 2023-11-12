package Boxes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstBox {
    private double maximumWeight;
    private ArrayList<ToBeStored> things;
    private double currentWeight;
    public FirstBox(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.things = new ArrayList<ToBeStored>();
        this.currentWeight=0;
    }
    public void add(ToBeStored thing){
        if(thing.weight()<this.maximumWeight-this.currentWeight){
            this.things.add(thing);
            this.currentWeight+=thing.weight();
        }
    }
    @Override
    public String toString(){
        return "Box: "+this.things.size()+", total weight "+this.currentWeight+" kg";
    }
}
