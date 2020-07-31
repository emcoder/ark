package test;

import animals.Bird;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class ApplicationTest {
    @Test
    @DisplayName("Singing test")
    public void singTest(){
        Bird birdie = new Bird();
        String expected = "I am singing";
        assumeTrue(birdie instanceof Bird);
        assertEquals(expected, birdie.sing());
    }
}