import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Prime_numberTest {

    @Test
    public void testIsPrime() {
        Prime_number maths = new Prime_number();

        // Test for prime numbers
        assertTrue(maths.isPrime(2), "2 should be a prime number");
        assertTrue(maths.isPrime(3), "3 should be a prime number");


        // Test for non-prime numbers
        assertFalse(maths.isPrime(1), "1 should not be a prime number");
        assertFalse(maths.isPrime(4), "4 should not be a prime number");

    }
}
