package Boxes;

public class Book implements ToBeStored{
    //Book receives its writer (String),
    // name (String), and weight (double), all as parameters

    private String writer;
    private String name;
    private double weight;

    Book(String writer, String name, double weight){
        this.writer=writer;
        this.name=name;
        this.weight=weight;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double weight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return this.writer+": "+this.name;
    }
}
