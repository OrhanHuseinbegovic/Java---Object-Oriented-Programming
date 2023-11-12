package Week7Lecture;

import java.util.HashMap;
import java.util.Map;

public class ThingPrinter<SomethingOfTypeGeneric, V> {
    private SomethingOfTypeGeneric thingToPrint;
    private V anotherThing;


    public ThingPrinter(SomethingOfTypeGeneric thingToPrint, V anotherThingToPrint) {
        this.thingToPrint = thingToPrint;
        this.anotherThing = anotherThingToPrint;
    }

    public SomethingOfTypeGeneric getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(SomethingOfTypeGeneric thingToPrint) {
        this.thingToPrint = thingToPrint;
    }


    public void printTheThing(){
        System.out.println(this.thingToPrint);
    }
    public void printAnotherTheThing(){
        System.out.println(this.thingToPrint);
    }

}

class JustMainThing{
    public static void main(String[] args) {
        ThingPrinter <String, Component> stringThingPrinter = new ThingPrinter<>("Becir", new Component("123"));
        stringThingPrinter.printTheThing();
        ThingPrinter<Integer, Motor> integerThingPrinter = new ThingPrinter<>(154, new Motor("1234"));
        integerThingPrinter.printTheThing();

        Map<String, Motor> stringMotorMap = new HashMap<>();
        Map<String, Component> second = new HashMap<>();
    }
}
