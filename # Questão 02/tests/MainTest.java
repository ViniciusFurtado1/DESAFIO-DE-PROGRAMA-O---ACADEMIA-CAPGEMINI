import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testVerifyPassword() {
        assertEquals(Main.verifyPassword("Ya3"), 3);
    }
}