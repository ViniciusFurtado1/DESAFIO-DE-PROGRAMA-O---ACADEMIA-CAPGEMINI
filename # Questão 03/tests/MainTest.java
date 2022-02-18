import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetAllSubstrings() {
        ArrayList<String> temp1 = new ArrayList<>();
        temp1.add("o");
        temp1.add("ov");
        temp1.add("ovo");
        temp1.add("v");
        temp1.add("vo");
        temp1.add("o");

        assertEquals(Main.getAllSubstrings("ovo"), temp1);
    }

    @Test
    void testGetNumOfAnagrams1() {
        assertEquals(Main.getNumOfAnagrams(Main.getAllSubstrings("ovo")), 2);
    }

    @Test
    void testGetNumOfAnagrams2() {
        assertEquals(Main.getNumOfAnagrams(Main.getAllSubstrings("ifailuhkqq")), 3);
    }

    @Test
    void testGetNumOfAnagrams3() {
        // [[i,i],[in,ni]]
        assertEquals(Main.getNumOfAnagrams(Main.getAllSubstrings("capgemini")), 2);
    }
}