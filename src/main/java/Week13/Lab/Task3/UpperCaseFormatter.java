package Week13.Lab.Task3;

public class UpperCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String message){
        return message.toUpperCase();
    }
}
