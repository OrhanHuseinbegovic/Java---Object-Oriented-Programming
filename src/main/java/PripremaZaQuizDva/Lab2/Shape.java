package PripremaZaQuizDva.Lab2;

public abstract class Shape {
    /*
    Shape Class have properties: color (String) - to store the
     color of the shape, and filled (enum FillType) - to indicate
      whether the shape is filled with color or not.
      FillType should be an enum with values FILLED and NOT_FILLED.
      Add a constructor to initialize the properties.
      Include a method called displayInfo() that prints the color
       of the shape and whether the shape is filled or not, and a method
       called getArea().
     */

    // Attributes
    private String color;
    private FillType fillType;

    // Constructor
    Shape(String color, FillType fill){
        this.color = color;
        this.fillType = fill;
    }

    public void displayInfo(){
        System.out.println("Color: "+this.color+"\nFill type: "+this.fillType);
    }
    public String getColor(){
        return this.color;
    }

    public FillType getFillType(){
        return this.fillType;
    }


    public abstract double getArea();
}
