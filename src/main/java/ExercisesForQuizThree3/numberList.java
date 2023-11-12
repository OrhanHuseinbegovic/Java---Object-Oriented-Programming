package ExercisesForQuizThree3;

import java.util.ArrayList;

public class numberList {
    ArrayList<Readable> readables;

    public numberList(){
        this.readables = new ArrayList<Readable>();
    }

    public void add(Readable readable){
        this.readables.add(readable);
    }

    public int howManyReadables(){
        return this.readables.size();
    }

    public String read() {
        String read = "";
        for(Readable readable: this.readables) {
            read += readable.read() + "\n";
        }

        this.readables.clear();
        return read;
    }
}
