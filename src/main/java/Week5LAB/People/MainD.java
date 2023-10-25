package Week5LAB.People;

import java.util.ArrayList;
import java.util.List;

public class MainD {
    public static void printDepartment( List<Person> pipl) {
        // we print all the people in the department
        for(Person p : pipl){
            System.out.println(p);
        }
        System.out.println("IT IS EXECUTED");
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);
    }
}
