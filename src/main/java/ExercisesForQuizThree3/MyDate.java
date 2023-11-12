package ExercisesForQuizThree3;

public class MyDate {
    private int day;
    private int month;
    private int year;

    MyDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    @Override
    public String toString(){
        return this.day+"."+this.month+"."+this.year;
    }
}
