import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testVerifyPassword1() {
        assertEquals(Main.verifyPassword("Ya3"), 3);
    }

    @Test
    void testVerifyPassword2() {
        assertEquals(Main.verifyPassword("Ya"), 4);
    }

    @Test
    void testVerifyPassword3() {
        assertEquals(Main.verifyPassword("Y"), 5);
    }
}