package Week6Lab;

abstract public class MilitaryService implements NationalService{
    int daysLeft;
    MilitaryService(int daysLeft){
        this.daysLeft=daysLeft;
    }
}
