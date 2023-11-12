package ExercisesForQuizThree3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        WeightWatchersAssociation weightWatcher = new WeightWatchersAssociation("Kumpulan paino", 25);

        Person matti = new Person("Matti");
        matti.setWeight(86);
        matti.setHeight(180);
        weightWatcher.addAsMember(matti);

        Person juhana = new Person("Juhana");
        juhana.setWeight(64);
        juhana.setHeight(172);
        weightWatcher.addAsMember(juhana);

        Person harri = new Person("Harri");
        harri.setWeight(104);
        harri.setHeight(182);
        weightWatcher.addAsMember(harri);

        Person petri = new Person("Petri");
        petri.setWeight(112);
        petri.setHeight(173);
        weightWatcher.addAsMember(petri);

        System.out.println( weightWatcher );
        System.out.println("\n-----\n");



        Person heaviest = weightWatcher.personWithHeighestWeightIndex();
        System.out.println("Member with the greatest weight index: "+heaviest.getName());
        System.out.println("Weight index "+String.format("%.2f", heaviest.weightIndex()));


         */

        /*
        Counter counter = new Counter();
        counter.grow();
        counter.grow();

        System.out.println(counter);         // prints 2

        Counter clone = counter.clone();

        System.out.println(counter);         // prints 2
        System.out.println(clone);           // prints 2

        counter.grow();
        counter.grow();
        counter.grow();
        counter.grow();

        System.out.println(counter);         // prints 6
        System.out.println(clone);           // prints 2

        clone.grow();

        System.out.println(counter);         // prints 6
        System.out.println(clone);

         */

            /*
        Book objectBook = new Book("Objectbook", 2000);
        Book anotherObjectBook = new Book("Objectbook", 2000);

        if (objectBook.equals(anotherObjectBook)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books are not the same");
        }

             */

        /*
        ArrayList<Book> books = new ArrayList<Book>();
        Book objectBook = new Book("Objectbook", 2000);
        books.add(objectBook);

        if (books.contains(objectBook)) {
            System.out.println("The object book was found.");
        }
        else{
            System.out.println("Not found");
        }

         */

        /*
        SMS message = new SMS("ope", "Awesome stuff!");
        System.out.println(message.read());

        ArrayList<SMS> messages = new ArrayList<SMS>();
        messages.add(new SMS("unknown number", "I hid the body."));

        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Split your method into short clear chunks.");
        pages.add("Devide the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        Ebook book = new Ebook("Programming Hints.", pages);
        for(int page = 0; page < book.howManyPages(); page++) {
            System.out.println(book.read());
        }

         */

        /*
        numberList joelList = new numberList();
        joelList.add(new SMS("matti", "have you already written the tests?"));
        joelList.add(new SMS("matti", "did you have a look at the submissions?"));

        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");


         */

        Printer printer = new Printer();

        String string = " o ";
        List<String> words = new ArrayList<String>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        printer.printManyTimes(string, 2);
        printer.printManyTimes(words, 3);
    }

}
