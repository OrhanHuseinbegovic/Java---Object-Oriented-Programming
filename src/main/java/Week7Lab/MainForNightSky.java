package Week7Lab;

public class MainForNightSky {
    public static void main(String[] args) {
        /*
        NightSky NightSky = new NightSky(0.5,40,10);
        NightSky.printLine();
         */


        NightSky NewNightSky = new NightSky(8,4);
        NewNightSky.print();
        System.out.println("Number of stars: "+NewNightSky.getStarsInLastPrint());
        System.out.println("");
        NewNightSky.print();
        System.out.println("Number of stars: "+NewNightSky.getStarsInLastPrint());
    }
}
