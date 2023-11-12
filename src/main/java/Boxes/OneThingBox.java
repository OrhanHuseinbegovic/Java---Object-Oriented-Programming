package Boxes;

import java.util.ArrayList;

public class OneThingBox extends Box{
    /*
     Next, implement the class OneThingBox in the package boxes;
      the class inherits Box. OneThingBox has the constructor public OneThingBox(),
       and only one thing can fit there. If the box already contains one thing,
       this should not be changed. The weight of the added thing is not important.
     */
    private ArrayList<Thing> oneThingBox;
    public OneThingBox(){
        this.oneThingBox = new ArrayList<Thing>();
    }
    @Override
    public void add(Thing thing){
        if (oneThingBox.size()!=1){
            oneThingBox.add(thing);
        }
    }
    @Override
    public boolean isInTheBox(Thing thing){
        if (this.oneThingBox.contains(thing)){
            return true;
        }
        return false;
    }
}
