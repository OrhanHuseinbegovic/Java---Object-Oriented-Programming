package Week13.Lab.Task6;

public class BuilderMain {
    public static void main(String[] args) {
        CoffeeDirector director = new CoffeeDirector();

        //Espresso
        EspressoBuilder espressoBuilder = new EspressoBuilder();
        director.constructCoffee(espressoBuilder);
        Coffee espresso = espressoBuilder.getCoffee();
        System.out.println("Espresso Order: " + espresso);

        //Latte
        LatteBuilder latteBuilder = new LatteBuilder();
        director.constructCoffee(latteBuilder);
        Coffee latte = latteBuilder.getCoffee();
        System.out.println("Latte Order: " + latte);

        //Cappuccino
        CappuccinoBuilder cappuccinoBuilder = new CappuccinoBuilder();
        director.constructCoffee(cappuccinoBuilder);
        Coffee cappuccino = cappuccinoBuilder.getCoffee();
        System.out.println("Cappuccino Order: " + cappuccino);
    }
}
