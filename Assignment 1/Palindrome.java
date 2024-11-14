public class Palindrome {

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false; // Null strings are not considered palindromes
        }
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters at any position do not match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome maths = new Palindrome();
        System.out.println("Is 'radar' a palindrome? " + maths.isPalindrome("radar")); // Output: true
    }
}
