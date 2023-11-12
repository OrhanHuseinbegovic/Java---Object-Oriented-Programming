package ExercisesForQuizThree3;

public class Book {
    private String name;
    private int publishingYear;

    public Book(String name, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    @Override
    public boolean equals(Object object){
        Book compared = (Book) object;
        if(this.name == compared.name){
            return true;
        }
        return false;
    }
}

