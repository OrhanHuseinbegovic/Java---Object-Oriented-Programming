package Week6Lab;

public class Book implements ToBeStored{
    private String writter;
    private String name;
    private double weight;

    Book(String writter, String name, double weight){
        this.writter = writter;
        this.name = name;
        this.weight = weight;
    }

    public String getWritter() {
        return writter;
    }

    public void setWritter(String writter) {
        this.writter = writter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        return this.getWritter()+": "+this.getName();
    }

    public double weight(){
        return 0;
    }
}
