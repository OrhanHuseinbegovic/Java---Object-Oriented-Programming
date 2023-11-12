package NewBirdWatcherDatabase;

import java.util.ArrayList;
public class BirdWatcherDatabase {
    ArrayList<Bird> birdDatabase;

    BirdWatcherDatabase(){
        this.birdDatabase=new ArrayList<Bird>();
    }

    public void addBird(Bird bird){
        this.birdDatabase.add(bird);
    }

    public void printAllBirds(){
        for (Bird bird : this.birdDatabase){
            System.out.println(bird+": "+bird.getObservation()+" observations");
        }
    }

    public void showBird(String name){
        if(this.searchByName(name)){
            Bird bird = returnBird(name);
            System.out.println(bird);
        }
    }

    public boolean searchByName(String name){
        for(Bird bird : this.birdDatabase){
            if(NamingUtils.included(bird.getName(),name)){
                return true;
            }
        }
        return false;
    }

    public Bird returnBird(String name){
        for(Bird bird : this.birdDatabase){
            if(NamingUtils.included(bird.getName(),name)){
                return bird;
            }
        }
        throw new IllegalArgumentException("Wrong");
    }

}
