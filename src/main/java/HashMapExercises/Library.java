package HashMapExercises;

import java.util.HashMap;

public class Library {
    /*
    Create the class Library, which encapsulates a HashMap containing books, and
    allows for book search regardless of its spelling.
    Add the methods addBook(Book book) and removeBook(String bookName) to our Library class.
    Create a separate method called private String stringCleaner(String string).
     */
    private HashMap<String, Book> collection;

    public Library(){
        this.collection = new HashMap<String, Book>();
    }

    public void addBook(Book book){
        String name = stringCleaner(book.getName());
        if(!this.collection.containsKey(name)){
            this.collection.put(name,book);
        }
        else{
            System.out.println("The book is already in library!");
        }
    }
    public void removeBook(String bookName){
        bookName = stringCleaner(bookName);
        if(this.collection.containsKey(bookName)){
            this.collection.remove(bookName);
        }
        else{
            System.out.println("Book was not found, can't delete it!");
        }

    }
    private String stringCleaner(String string){
        if(string == null){
            return "";
        }
        string = string.toLowerCase();
        string = string.trim();
        return string;
    }

    public Book getBook(String bookName) {
        bookName = stringCleaner(bookName);
        return this.collection.get(bookName);
    }

    public Book getBookUsingItsBeginningCharacters(String beginning) {
        beginning = stringCleaner(beginning);

        for (String key: this.collection.keySet()) {
            if (key.startsWith(beginning)) {
                return this.collection.get(key);
            }
        }

        return null;
    }

}
