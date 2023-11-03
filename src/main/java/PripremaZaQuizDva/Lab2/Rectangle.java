package PripremaZaQuizDva.Lab2;

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
    private double width;
    private double height;
    Rectangle(FillType type, String color, double wid, double hei){
        super(color, type);
        this.width = wid;
        this.height = hei;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    @Override
    public void displayInfo(){
        System.out.println("Fill Type: "+this.getFillType());
        System.out.println("Color: "+this.getColor());
        System.out.println("Width: "+this.getWidth());
        System.out.println("Height: "+this.getHeight());
    }

    public double getArea(){
        return this.getHeight()*this.getWidth();
    }
}
