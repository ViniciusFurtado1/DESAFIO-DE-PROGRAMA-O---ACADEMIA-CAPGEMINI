import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetStair() {
        assertEquals(String.valueOf(Main.getStair(6)), """       
                                                                         *
                                                                        **
                                                                       ***
                                                                      ****
                                                                     *****
                                                                    ******""");
    }
}