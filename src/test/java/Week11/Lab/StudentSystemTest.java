package Week11.Lab;


import Week11.Lecture.Task1.SongsSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class StudentSystemTest {
    static StudentSystem studentSystem;

    @BeforeEach
    void initializeSongs(){
        studentSystem = new StudentSystem("songs.csv");
    }

    @Test
    void testifStudentisPresent() throws IOException {
        assertTrue(studentSystem.getHighestGPAStudent().isPresent(), "Expected at least one student to be present");
    }

    @Test
    void testStudentWithId100() throws IOException{
        try {
            Optional<Student> studentWithId100 = studentSystem.getStudentById(100);
            assertFalse(studentWithId100.isPresent(), "Expected student with ID 100 not to be present");
        } catch (IOException | EmptyStudentListException e) {
            e.printStackTrace(); // Or use a logger to log the exception
        }
    }

    @Test
    void testHighestGPAStudent() throws IOException {
        assertTrue(studentSystem.getHighestGPAStudent().isPresent(), "Expected student with highest GPA to be present");
    }

    @Test
    void testExceptionForEmptyStudentList(){
        String filePath = "empty.csv";
        assertThrows(EmptyStudentListException.class, () -> {
            studentSystem.getHighestGPAStudent();
        }, "Expected EmptyStudentListException for an empty student list");
    }

    /*
    Write a unit test testNamesArray()to verify that the first
     five elements in the 'actualNames' array,
      obtained from the 'system' by mapping student names,
       match the expected names provided in the 'expectedNames' array.
     */
    @Test
    void testNamesArray(){

    }

    @Test
    void testSize(){
        String filePath = "students.csv";
        try {
            long fileSize = Files.size(Paths.get(filePath));

            assertEquals(70, fileSize, "Expected file size to be 70 bytes");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testLargestName() throws IOException {
        assertNotEquals("Ava White",studentSystem.getLongestNameStudent());
    }

    @Test
    void testStudents() throws IOException {
        assertNotEquals(studentSystem.getHighestGPAStudent(),studentSystem.getLongestNameStudent());
    }

    @Test
    void testSameStudent() throws IOException {
        assertEquals(studentSystem.getHighestGPAStudent(),studentSystem.getStudentById(12));
    }

}
