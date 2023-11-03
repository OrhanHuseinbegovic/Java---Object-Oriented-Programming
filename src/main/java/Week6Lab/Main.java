package Week6Lab;

import java.util.Collection;

public class Main {
    public static void main(String[] args){
        /*
        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD ("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD ("Wigwam","Nuclear Nightclub", 1975);
        CD cd3 = new CD ("Rendezvous Park","Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);


        System.out.println("\n-----------\n");
        Box box = new Box(10);
        box.add(new Book("Fedor Dostojevski", "Crime and Punishment",2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd","Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park","Closer to Being Here", 2012));

        System.out.println(box);
        */

        System.out.println("\n-----------\n");
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo",5));
        coffeeBox.add(new Thing("Pirkka",5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));

        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo",5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox((new Thing("Pirkka"))));

        BlackHoleBox blackbox = new BlackHoleBox();
        blackbox.add(new Thing("Saludo",5));
        blackbox.add(new Thing("Pirkka", 5));

        System.out.println(blackbox.isInTheBox(new Thing("Saludo")));
        System.out.println(blackbox.isInTheBox((new Thing("Pirkka"))));


    }
}
