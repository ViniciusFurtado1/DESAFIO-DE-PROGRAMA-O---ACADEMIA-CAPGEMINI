import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetStair1() {
        assertEquals(String.valueOf(Main.getStair(6)), """       
                                                                         *
                                                                        **
                                                                       ***
                                                                      ****
                                                                     *****
                                                                    ******""");
    }

    @Test
    void testGetStair2() {
        assertEquals(String.valueOf(Main.getStair(3)), """       
                                                                      *
                                                                     **
                                                                    ***""");
    }

    @Test
    void testGetStair3() {
        assertEquals(String.valueOf(Main.getStair(9)), """       
                                                                            *
                                                                           **
                                                                          ***
                                                                         ****
                                                                        *****
                                                                       ******
                                                                      *******
                                                                     ********
                                                                    *********""");
    }
}