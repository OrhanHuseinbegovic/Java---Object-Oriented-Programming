package ExercisesForQuizThree3;

import java.util.ArrayList;

public class WeightWatchersAssociation {
    private double lowestWeightIndex;
    private String name;
    private ArrayList<Person> members;

    WeightWatchersAssociation(double indexLimit){
        this.lowestWeightIndex = indexLimit;
    }
    WeightWatchersAssociation(String name, double lowestWeightIndex){
        this.name = name;
        this.lowestWeightIndex = lowestWeightIndex;
        this.members = new ArrayList<Person>();
    }
    public boolean isAcceptedAsMember(Person person){
        if(person.weightIndex()<this.lowestWeightIndex){
            return false;
        }
        return true;
    }
    public void addAsMember(Person person){
        if(!isAcceptedAsMember(person)){
            return;
        }
        this.members.add(person);
    }

    @Override
    public String toString(){
        String membersAsString="";
        for(Person p : this.members){
            membersAsString += " "+p.getName()+" \n";
        }
        return "The members of weight watchers association "+this.name+" members: \n"+membersAsString;
    }

    public void printMembers(){
        for(Person p : this.members){
            System.out.println(p);
        }
    }
    public Person personWithHeighestWeightIndex(){
        if(this.members.isEmpty()){
            return null;
        }
        Person heaviestSofar = this.members.get(0);
        for(Person p : this.members){
            if(p.weightIndex()>heaviestSofar.weightIndex()){
                heaviestSofar = p;
            }
        }
        return heaviestSofar;
    }
}
