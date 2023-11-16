package LabWeek7Exercises.LibraryCatalogSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Create a class named LibraryCatalog that contains a list of books.

/*
Add methods to the catalog to:
Check the availability of a book by title.
Retrieve the details of the first available book by a specific author.
Update the availability status of a book.

 */
public class LibraryCatalog {
    private ArrayList<Book> listOfBooks;

    public LibraryCatalog(){
        this.listOfBooks=new ArrayList<Book>();
    }

    public boolean isInTheListAuthor(String author){
        for(Book book : this.listOfBooks){
            String authorName = book.author().toLowerCase();
            authorName = book.author().trim();
            author = author.toLowerCase();
            author = author.trim();
            if (author.equals(authorName)){
                return true;
            }
        }
        return false;
    }
    public boolean isInTheListTitle(String titleToCheck){
        for(Book book : this.listOfBooks){
            String bookName = book.title().toLowerCase();
            bookName = book.title().trim();
            titleToCheck = titleToCheck.toLowerCase();
            titleToCheck = titleToCheck.trim();
            if (titleToCheck.equals(bookName)){
                return true;
            }
        }
        return false;
    }

    public void availableStatus(){
        System.out.println("");
    }

    //Use optionals to handle scenarios where a book may or may not be found

    public static Optional<Book> getBookNameOptional(String name){
        return Optional.ofNullable(null);
    }

    public void updateBookAvailability(String title, boolean availability) {
        listOfBooks.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .ifPresent(book -> book = new Book(book.title(), book.author(), book.publicationYear(), availability));
    }

    // Getter for the list of books
    public List<Book> getBooks() {
        return listOfBooks;
    }
}
