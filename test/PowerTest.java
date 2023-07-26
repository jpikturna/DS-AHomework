
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class PowerTest {

    @Test
    void testPositivePowerOfFour() {
        long num1 = 16;
        long num2 = 64;

        Assertions.assertTrue(Power.isPowerOfFour(num1));
        Assertions.assertTrue(Power.isPowerOfFour(num2));
    }

    @Test
    void testNonPositiveInput() {
        long num1 = 0;
        long num2 = -1;
        long num3 = -16;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Power.isPowerOfFour(num1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Power.isPowerOfFour(num2);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Power.isPowerOfFour(num3);
        });
    }

    @Test
    void testNonPowerOfFour() {
        long num1 = 20;
        long num2 = 100;
        long num3 = 45;

        Assertions.assertFalse(Power.isPowerOfFour(num1));
        Assertions.assertFalse(Power.isPowerOfFour(num2));
        Assertions.assertFalse(Power.isPowerOfFour(num3));
    }
}
