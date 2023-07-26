
/**
 * Defines a single static method, {@link #isPowerOfFour(long)}, which evaluates a specified value
 * to determine whether it is an integral power of 4.
 */
public abstract class Power {

    private Power() {
        // NOTE: There is NO need to do anything with this constructor! The method you will implement
        //       in this class is static; thus, there is no need to create instances of this class.
    }

    /**
     * Computes and returns a {@code boolean} flag indicating whether the provided {@code input} is a
     * power of four. A non-positive (zero or negative) {@code input} value will result in
     * {@link IllegalArgumentException} being thrown.
     *
     * @param input Value to be tested.
     * @return Flag indicating whether {@code input} is an integral power of four.
     * @throws IllegalArgumentException When {@code input} is non-positive (zero or negative).
     */

    public static boolean isPowerOfFour(long input) throws IllegalArgumentException {
        if (input <= 0) {
            throw new IllegalArgumentException("Input must be a positive number.");
        }

        while (input % 4 == 0) {
            input /= 4;
        }

        return input == 1;
    }

    public static void main(String[] args) {
        try {
            long num1 = 16;
            long num2 = 64;
            long num3 = 20;

            System.out.println(num1 + " is a power of 4: " + isPowerOfFour(num1)); // true
            System.out.println(num2 + " is a power of 4: " + isPowerOfFour(num2)); // true
            System.out.println(num3 + " is a power of 4: " + isPowerOfFour(num3)); // false
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}