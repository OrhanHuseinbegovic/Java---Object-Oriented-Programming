package LabWeek7Exercises;

public class Main {
    public static void main(String[] args) {
        Record Orhan = new Record("Orhan");
        ClassLoger Fikret = new ClassLoger("Fikret");

        Logger lambdaLogger1 = (message) -> System.out.println("LambdaLogger1: " + message);
        Logger lambdaLogger2 = (message) -> System.out.println("LambdaLogger2: " + message);

        lambdaLogger1.logMessage("This is a log message from LambdaLogger1.");
        lambdaLogger2.logMessage("This is a log message from LambdaLogger2.");

    }
}
