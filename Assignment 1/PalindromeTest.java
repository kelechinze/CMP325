import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        Palindrome maths = new Palindrome();

        // Test for palindromes
        assertTrue(maths.isPalindrome("radar"), "'radar' should be a palindrome");

        // Test for non-palindromes
        assertFalse(maths.isPalindrome("hello"), "'hello' should not be a palindrome");

    }
}
