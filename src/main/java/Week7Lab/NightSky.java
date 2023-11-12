package Week7Lab;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    NightSky(double density){
        this.density = density;
        this.width=20;
        this.height=10;
    }
    NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getStarsInLastPrint() {
        return starsInLastPrint;
    }

    public void setStarsInLastPrint(int starsInLastPrint) {
        this.starsInLastPrint = starsInLastPrint;
    }

    public void printLine(){
        for(int i=0; i<=this.getWidth(); i++){
            double randomValue = randomNumber();
            if(randomValue==this.getDensity()){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
    }

    public static double randomNumber() {
        Random random = new Random();
        // Generate a random integer between 1 and 10 (inclusive)
        int randomInt = random.nextInt(10) + 1;
        // Convert the integer to a double rounded to one decimal place
        double randomDouble = randomInt / 10.0;
        return randomDouble;
    }

    public void print(){
        double checkRandomValue = randomNumber();
        int starCounter = 0;
        for(int i=0; i<this.getHeight(); i++){
            for(int j=0; j<=this.getWidth(); j++){
                double randomValue = randomNumber();
                if(checkRandomValue==randomValue){
                    System.out.print("*");
                    starCounter++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        this.setStarsInLastPrint(starCounter);
    }
}
