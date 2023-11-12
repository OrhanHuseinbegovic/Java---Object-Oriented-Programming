package TheLibraryInformationSystem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;
    public Library(){
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        this.library.add(newBook);
    }
    public void printBooks(){
        for(Book book : this.library){
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> returnable = new ArrayList<Book>();
        for(Book book : this.library){
            if(StringUtils.included(book.title(),title)){
                returnable.add(book);
            }
        }
        return returnable;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> returnable = new ArrayList<Book>();
        for(Book book : this.library){
            if(StringUtils.included(book.publisher(),publisher)){
                returnable.add(book);
            }
        }
        return returnable;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> returnable = new ArrayList<Book>();
        for(Book book : this.library){
            if(book.year()==year){
                returnable.add(book);
            }
        }
        return returnable;
    }
}
