package Week5Lecture;

import java.util.Date;

public class Vehicle {
    private String color;
    private int numOfWheels;
    private Date dateOfManufacture;

    public Vehicle(String color, int numOfWheels, Date dateOfManufacture) {
        System.out.println("Vehicle construtor is called");
        this.color = color;
        this.numOfWheels = numOfWheels;
        this.dateOfManufacture = dateOfManufacture;
    }

    public Vehicle(String color, int numOfWheels){
        System.out.println("SECOND VEHICLE CONS. CALLED");
        this.color = "black";
        this.numOfWheels = 2;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void generateSound(){
        System.out.println("BRNN BRN");
    }
}
