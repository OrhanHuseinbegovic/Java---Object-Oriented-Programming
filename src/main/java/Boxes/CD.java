package Boxes;

public class CD implements ToBeStored{
    //parameter contains its artist (String), title (String),
    // and publishing year (int). All CDs weigh 0.1 kg.
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;
    CD(String artist, String title, int publishingYear){
        this.artist=artist;
        this.title=title;
        this.publishingYear=publishingYear;
        this.weight=0.1;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public double weight(){
        return this.weight;
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
        return this.artist+": "+this.title+" ("+this.publishingYear+")";
    }
}
