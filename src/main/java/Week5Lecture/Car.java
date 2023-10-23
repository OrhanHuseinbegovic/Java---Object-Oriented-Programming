package Week5Lecture;

import java.util.Date;

public class Car extends Vehicle{
    private String motorType;

    public Car(String color, int numOfWheels, Date dateOfManufacture, String motorType) {
        super(color, numOfWheels, dateOfManufacture);
        this.motorType = motorType;
        System.out.println("Car constructor has been called");
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
}
