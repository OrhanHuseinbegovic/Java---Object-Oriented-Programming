package Boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box{
    /*
    Implement the class MaxWeightBox in the package boxes;
    the class inherits Box. MaxWeightBox has the constructor
    public MaxWeightBox(int maxWeight), which determines the box's maximum weight.
    Things can be added to MaxWeightBox if and only if the thing weight does not exceed the box weight.
     */
    private int maxWeight;
    private double curWei;
    private ArrayList<Thing> maxWeightBox;
    public MaxWeightBox(int maxWeight){
        this.maxWeight=maxWeight;
        this.curWei=0;
        this.maxWeightBox = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing){
        if(thing.getWeight()<=this.maxWeight-this.curWei){
            maxWeightBox.add(thing);
            this.curWei+=(double)thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing){
        if(this.maxWeightBox.contains(thing)){
            return true;
        }
        return false;
    }
}
