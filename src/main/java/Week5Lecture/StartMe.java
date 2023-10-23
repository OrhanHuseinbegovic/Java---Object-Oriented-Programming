package Week5Lecture;

import java.util.Date;

public class StartMe {
    public static void main (String[] args){
        Bicycle bike = new Bicycle("black", 2, "num of pedals");
        Car car = new Car("black",2,new Date(),"Petrol");
        bike.generateSound();
        car.generateSound();
        bike.toString();

    }
}
