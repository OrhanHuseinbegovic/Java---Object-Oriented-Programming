package Boxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box{
    /*
     Next, implement the class BlackHoleBox in the package boxes;
      the class inherits Box. BlackHoleBox has the constructor public BlackHoleBox();
      anything can be added to a black-hole box, but none will be found when you look for them.
      In other words, adding things must always work, but the method isInTheBox has to always return false.
     */
    private ArrayList<Thing> blackHoleBox;
    public BlackHoleBox(){
        this.blackHoleBox=new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing){
        this.blackHoleBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
