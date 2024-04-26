import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test_getZegop_basic() {
        double actual = Main.getZegop(2, 4);
        double expected = 16.0;

        assertEquals(expected, actual);
    }

    @Test
    void test_getZegop_param_target_is_0() {
        double actual = Main.getZegop(0, 2);
        double expected = 0.0;

        assertEquals(expected, actual);
    }

    @Test
    void test_getZegop_param_square_is_0() {
        double actual = Main.getZegop(2, 0);
        double expected = 1;

        assertEquals(expected, actual);
    }
}