package LibraryInformationSystem;

public class Book {
    private String title;
    private String name;
    private int year;

    /*
    Now implement the class Book. The class should have the
     constructor public Book(String title, String publisher, int year)
      and methods public String title(), public String publisher(),
       public int year() and public String toString().
     */

    Book(String title, String publisher, int year){
        this.title = title;
        this.name = publisher;
        this.year = year;
    }
    public String title(){
        return this.title;
    }
    public String publisher(){
        return this.name;
    }
    public int year(){
        return this.year;
    }
    @Override
    public String toString(){
        return this.title+", "+this.name+", "+this.year;
    }
    /*
    public boolean contains(String title) {
        if(this.name.equals(title)){
            return true;
        }
        return false;
    }

     */
    public boolean containsTitle(String searchTitle) {
        // Check if the title contains the search string (case-insensitive)
        return title.toLowerCase().contains(searchTitle.toLowerCase());
    }

    public boolean containsPublisher(String searchPublisher) {
        // Check if the publisher contains the search string (case-insensitive)
        return name.toLowerCase().contains(searchPublisher.toLowerCase());
    }
}
