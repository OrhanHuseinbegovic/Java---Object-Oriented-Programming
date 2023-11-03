package PripremaZaQuizDva.Lab2;

public class Circle extends Shape{
    /* Circle Class  extends the Shape class and
    has property radius (double) - to store the radius of the circle.
     Add a constructor to initialize filltype, color, and radius properties.
     Override the displayInfo() and getArea() methods to display the
      information specific to the circle, including the radius, color,
       filltype and to calculate the area of a circle.
     */
    //ATTRIBUTES
    private double pi = 3.14;
    private double radius;

    //CONSTRUCTOR
    Circle(FillType type, String color, double radius){
        super(color, type);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public void displayInfo(){
        System.out.println("Color: "+this.getColor());
        System.out.println("Fill Type: "+this.getFillType());
        System.out.println("Radius: "+this.getRadius());
    }


    @Override
    public double getArea(){
        return 2*3.14*this.getRadius();
    }

    /*
    Add the function calculateCircumference(double PI, double r)
    to calculate circumference (2πr) and one more same method
     calculateCircumference(double r) where the PI will now be
     taken as a constant and not as a parameter.
     */

    public double calculateCircumference(double PI, double r){
        return PI*2*r;
    }

    public double calculateCircumference(double r){
        return this.pi*r*2;
    }
}
