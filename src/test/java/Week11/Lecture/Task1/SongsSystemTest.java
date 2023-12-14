package Week11.Lecture.Task1;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SongsSystemTest {

    static SongsSystem system;
    @BeforeEach
    void initializeSongs(){
        system = new SongsSystem("songs.csv");
    }
    @Test
    void ifId500IsPassed_thenThrowTheSongNotFoundException(){
        assertThrows(SongNotFoundExcption.class,() ->{
            system.getSongById(500);
        });
    }

    @Test
    void ifId10Passed_nameShouldEqual(){
        assertEquals("bad guy", system.getSongById(10).get().name());
    }

    @Test
    void ifMultipleTest_thenPass(){
        assertAll(
                () -> assertEquals("bad guy", system.getSongByName("bad guy")),
                () -> assertEquals("Sucker", system.getSongByName("Sucker"))
        );
    }


}