package PripremaZaQuizDva.Lab2;

import static PripremaZaQuizDva.Lab2.FillType.FILLED;
import static PripremaZaQuizDva.Lab2.FillType.NOT_FILLED;

public class MainShape {
    // In Main, create instances of the Circle and
    // Rectangle classes and set their properties
    // and call the displayInfo() method to display
    // the information about each shape and fill types.

    public static void main(String[] args){
        Circle firstCircle = new Circle(FILLED, "Black", 2.0);
        Rectangle firstRec = new Rectangle(NOT_FILLED,"White",2.0,3.0);

        firstRec.displayInfo();

        System.out.println("\n");

        firstCircle.displayInfo();
    }
}
