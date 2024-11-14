public class Prime_number{

    // Method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime_number maths = new Prime_number();
        System.out.println("Is 5 prime? " + maths.isPrime(5)); // Output: true
    }
}
