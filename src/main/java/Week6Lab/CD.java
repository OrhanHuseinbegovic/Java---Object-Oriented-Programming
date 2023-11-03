package Week6Lab;

public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;

    CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return this.getArtist()+": "+this.getTitle()+" ("+this.getPublishingYear()+")";
    }

    public double weight(){
        return 0;
    }
}
