package Week5Lecture;

import java.util.Date;

public class Bicycle extends Vehicle{
    private String numOfPedals;

    public Bicycle(String color, int numOfWheels, Date dateOfManufacture, String numOfPedals) {
        super(color, numOfWheels, dateOfManufacture);
        this.numOfPedals = numOfPedals;
    }

    public Bicycle(String color, int numOfWheels, String numOfPedals) {
        super(color, numOfWheels);
        this.numOfPedals = numOfPedals;
    }

    public String getNumOfPedals() {
        return numOfPedals;
    }

    public void setNumOfPedals(String numOfPedals) {
        this.numOfPedals = numOfPedals;
    }

    @Override
    public void generateSound(){
        System.out.println("FIIIII");
    }

    @Override
    public String toString(){
        return "I have "+String.valueOf(this.numOfPedals);
    }
}
