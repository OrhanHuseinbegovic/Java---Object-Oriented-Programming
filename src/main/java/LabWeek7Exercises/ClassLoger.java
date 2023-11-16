package LabWeek7Exercises;

public class ClassLoger implements Logger{
    private String loggerName;
    public ClassLoger(String loggerName){
        this.loggerName=loggerName;
    }
    public void logMessage(String loggerName){
        System.out.println(loggerName);
    }

}
