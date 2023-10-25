package Week5LAB.People;

public abstract class Shape {
    String color;
    FillType fillType;

    public Shape(String color, FillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }

    public void displayInfo(){
        System.out.println("COLOR: "+this.color);
        System.out.println("FILLED: "+this.fillType);
    }


    public abstract double getArea();

}

enum FillType{
    FILLED, NOT_FILLED
}
