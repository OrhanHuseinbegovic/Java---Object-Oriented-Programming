package Boxes;

public class Main {
    public static void main(String[] args) {
        /*
        Book book1 = new Book("Fedor Dostojevski","Crime and punishment",2);
        Book book2 = new Book("Robert Martin", "Clean code", 1);
        Book book3 = new Book("Kent Beck","Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark side of the Moon", 1972);
        CD cd2 = new CD("Wigwam", "Nuclear NightClub", 1975);
        CD cd3 = new CD("Randezvous Park","Closer to being here", 2012);

        FirstBox box = new FirstBox(10);
        box.add(book1);
        box.add(book2);
        box.add(book3);
        box.add(cd1);
        box.add(cd2);
        box.add(cd3);



        System.out.println(box);

         */

        /*
        MaxWeightBox coffeBox = new MaxWeightBox(10);
        coffeBox.add(new Thing("Saludo",5));
        coffeBox.add(new Thing("Pirkka",5));
        coffeBox.add(new Thing("Kopi Luwak", 5));
        System.out.println(coffeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeBox.isInTheBox(new Thing("Kopi Luwak")));

         */
    /*
        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo",5));
        box.add(new Thing("Pirkka", 5));
        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

     */

        /*

        BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Saludo",5));
        box.add(new Thing("Pirkka", 5));
        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));


         */

        /*
        To enhance the flexibility and utility of the provided classes,
         you are required to implement upcasting and downcasting techniques.
         Implement upcasting by creating objects of
         classes Thing, MaxWeightBox, OneThingBox, and BlackHoleBox, and assign them to variables of type Box.
          Implement downcasting cautiously using the instanceof operator to check
          the compatibility of objects before performing the cast.
          Downcasting Box to MaxWeightBox, Thing, OneThingBox and BlackHoleBox.

         */

        //Upcasting
        Box box1 = new MaxWeightBox(10);
        Box box2 = new OneThingBox();
        Box box3 = new BlackHoleBox();

        // Create objects of Thing
        Thing thing1 = new Thing("Book", 2);
        Thing thing2 = new Thing("CD", 0.5);

        // Add things to boxes
        box1.add(thing1);
        box2.add(thing2);
        box3.add(thing1);

        // Downcasting with instanceof checks
        if (box1 instanceof MaxWeightBox) {
            MaxWeightBox maxWeightBox = (MaxWeightBox) box1;
            System.out.println("Downcasted to MaxWeightBox");
        }

        if (box2 instanceof OneThingBox) {
            OneThingBox oneThingBox = (OneThingBox) box2;
            System.out.println("Downcasted to OneThingBox");
        }

        if (box3 instanceof BlackHoleBox) {
            BlackHoleBox blackHoleBox = (BlackHoleBox) box3;
            System.out.println("Downcasted to BlackHoleBox");
        }

        /*
        // Downcasting Thing to Box
        if (thing1 instanceof Box) {
            Box boxFromThing = (Box) thing1;
            System.out.println("Downcasted from Thing to Box");
        }

         */




    }
}
