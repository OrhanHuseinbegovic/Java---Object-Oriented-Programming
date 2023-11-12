package ExercisesForQuizThree3;

import java.util.ArrayList;

public class Ebook implements  Readable{
    private String bookName;
    private int pageNumber;
    private ArrayList<String> pages;

    public Ebook(String bookName, ArrayList<String> pages) {
        this.bookName = bookName;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    @Override
    public String read(){
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }

    private void nextPage(){
        this.pageNumber++;
        if(this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }

    }

    public int howManyPages(){
        return this.pages.size();

    }
}
