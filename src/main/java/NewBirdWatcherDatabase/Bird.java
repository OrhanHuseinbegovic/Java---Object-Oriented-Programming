package NewBirdWatcherDatabase;

public class Bird {
    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void observe(){
        this.observed++;
    }

    public int getObservation(){
        return this.observed;
    }

    public String toString(){
        return this.name+"("+this.latinName+"): "+this.getObservation()+" observations";
    }
}
