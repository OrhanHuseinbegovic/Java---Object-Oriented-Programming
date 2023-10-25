package Week5LAB.People;

public class TheNewestMain {
    public static void main(String[] args){
        /*
        In Main, create instances of the Circle and
         Rectangle classes and set their properties
          and call the displayInfo() method to display
          the information about each shape and fill types.
         */
        Circle newCircle = new Circle("black",FillType.FILLED,2);
        Rectangle newRectangle = new Rectangle("white",FillType.NOT_FILLED,2,3);

        newCircle.displayInfo();
        newCircle.getArea();
        System.out.println("--");
        newRectangle.displayInfo();
        newRectangle.getArea();
    }
}
