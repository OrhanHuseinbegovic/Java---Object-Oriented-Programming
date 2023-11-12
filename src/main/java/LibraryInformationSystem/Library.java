package LibraryInformationSystem;

import java.util.ArrayList;
import java.util.List;



public class Library{
    /*
    Implement the class Library, with constructor public
     Library() and methods public void addBook(Book newBook)
     and public void printBooks()
     */
    private ArrayList<Book> library = new ArrayList<Book>();
    public Library(){

    }
    public void addBook(Book newBook){
        library.add(newBook);
    }
    public void printBooks(){
        for(Book books: library){
            System.out.println(books);
        }
    }
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : library){
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        // iterate the list of books and add all the matching books to the list found
        return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : library){
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        // iterate the list of books and add all the matching books to the list found
        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : library){
            if(book.year() == year){
                found.add(book);
            }
        }
        // iterate the list of books and add all the matching books to the list found
        return found;
    }

    /*
    We'd like the search functionality to be case insensitive and not disturbed by the
     extra white spaces at the start or at the end of the search terms. We will implement
        a small helper library StringUtils that will then be used in the Library for the more
         flexible search functionality.

    Implement the class StringUtils with a static method
     public static boolean included(String word, String searched),
     which checks if the string searched is contained within the string word.

    As described in the previous paragraph, the method should be case insensitive
    and should not care about trailing and ending white spaces in the string searched.
    If either of the strings is null, the method should return false.

    Tip: The methods trim and toUpperCase() of the class String might be helpful.
    When you have completed the method, use it in the search functionality of the class Library.

    Use the method as follows:

    if(StringUtils.included(book.title(), searchedTitle)) {
        // Book found!
    }

     */
}
