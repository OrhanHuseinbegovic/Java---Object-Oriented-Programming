package Week5LAB.People;

public class Circle extends Shape{
    double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    @Override
    public void displayInfo(){
        System.out.println("COLOR: "+this.radius);
        System.out.println("FILLED: "+this.color);
        System.out.println("FILLTYPE: "+this.fillType);
    }

    @Override
    public double getArea(){
        return this.radius*this.radius*3.14;
    }

    public double calculateCircumference(double PI, double r){
        return 2*PI*r;
    }

    public double calculateCircumference(double r){
        double pi = 3.14;
        return 2*pi*this.radius;
    }

}
