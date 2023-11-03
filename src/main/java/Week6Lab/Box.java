package Week6Lab;

public class Box implements ToBeStored{
    int maxWeight;
    int checkWeight;
    int numOfThings;
    Box(int maxWeight){
        this.maxWeight = maxWeight;
        this.checkWeight = 0;
        this.numOfThings = 0;
    }

    public double weight(CD cd){
        if((this.maxWeight-this.checkWeight)>cd.getWeight()){
            this.checkWeight+=cd.getWeight();
        }
        return this.checkWeight;
    }
    
    public double weight(){
        return 0;
    }

    public void add(CD cd) {
        if (this.checkWeight + cd.getWeight() <= this.maxWeight) {
            this.checkWeight += cd.getWeight();
            this.numOfThings++;
        } else {
            System.out.println("Cannot add CD, the box is full.");
        }
    }

    public void add(Book book) {
        if (this.checkWeight + book.getWeight() <= this.maxWeight) {
            this.checkWeight += book.getWeight();
            this.numOfThings++;
        } else {
            System.out.println("Cannot add book, the box is full.");
        }
    }

    public String toString(){
        return "Box: "+this.numOfThings+" things, total weight "+this.checkWeight+" kg";
    }
}
