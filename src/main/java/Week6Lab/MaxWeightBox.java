package Week6Lab;

import java.util.Collection;

public class MaxWeightBox extends ABox{
    int maxWeight;
    int control;

    MaxWeightBox(int max){
        this.maxWeight = max;
        this.control = 0;
    }

    @Override
    public boolean isInTheBox(Thing thing){
        if(thing.getName().equals(thing.name)){
            return true;
        }
        return false;
    }
    @Override
    public void add(Collection<Thing> things){
        for(Thing thing : things){
            if(thing.getWeight()<this.getMaxWeight()-this.getControl()){
                add(thing);
            }
        }
    }

    public int getMaxWeight(){
        return this.maxWeight;
    }
    public int getControl(){
        return this.control;
    }
}
