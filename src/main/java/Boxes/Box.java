package Boxes;

import java.util.Collection;
public abstract class Box {
    public abstract void add(Thing things);
    public void add(Collection<Thing> things){
        for(Thing thing : things){
            add(thing);
        }
    }
    public abstract boolean isInTheBox(Thing thing);
}


