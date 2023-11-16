package LabWeek7Exercises;

public record Record(String loggerName) implements Logger{
    @Override
    public void logMessage(String message){
        System.out.println(message);
    }
}
