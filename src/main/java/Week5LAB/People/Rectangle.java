package Week5LAB.People;

public class Rectangle extends Shape{
    /*
    You should also create a class called Rectangle
    that extends the Shape class as well and the class
    has properties width (double) and height (double) -
     to store the width and height of the rectangle.
     Add a constructor to initialize the filltype, color,
      width, and height properties. Override the displayInfo()
      and getArea() methods to display the information specific
       to the rectangle, including the width and height and its area.
     */
    double width;
    double height;

    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo(){
        System.out.println("WIDTH: "+this.width);
        System.out.println("FILLED: "+this.height);
    }

    @Override
    public double getArea(){
        return this.width*this.height;
    }
}
