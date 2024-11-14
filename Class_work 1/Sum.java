//Sum of two numbers.
public class Sum{
    int calculateSum(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Sum maths = new Sum();
        int result = maths.calculateSum(1,2);
        System.out.println("The sum is: " + result);
    }
}