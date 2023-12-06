package Week10.Lab.Task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Events {
    private static final int NUM_OF_RECORDS = 1_000_000;
    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    public static void generateEventsFile(String fileName, int numOfRecords) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(fileName)
        );
        Random random = new Random();

        for (int i = 0; i < numOfRecords; i++) {
            // Generate a random timestamp (replace with your logic)
            long timestamp = System.currentTimeMillis() - random.nextInt(86400000);

            // Randomly select an event type
            String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];

            // Generate a random user ID between 0 and 999
            int userId = random.nextInt(1000);

            // Write the event to the file
            bufferedWriter.write(timestamp + "," + eventType + "," + userId);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public static void readEventsFile(String fileName) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(fileName)
        );
        for (int i = 0 ; i<6; i++){
            System.out.println("Iteration " + i + ":");
            Files.lines(Paths.get(fileName))
                    .forEach(System.out::println);
            System.out.println("------------");
        }
        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        final String FILENAME = "events.txt";
        generateEventsFile(FILENAME, NUM_OF_RECORDS);
        readEventsFile(FILENAME);
    }
}
