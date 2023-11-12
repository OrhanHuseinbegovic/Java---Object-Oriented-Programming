package NightSky;

public class Main {
    public static void main(String[] args) {

        NightSky newNight = new NightSky(8,4);
        newNight.print();

        System.out.println("Number of stars: "+newNight.starsInLastPrint());
        System.out.println();
        newNight.print();
        System.out.println("Number of stars: "+newNight.starsInLastPrint());
    }
}
