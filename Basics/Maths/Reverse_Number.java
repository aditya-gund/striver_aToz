import java.util.Stack;

public class Reverse_Number {
    public static int reverseNumber(int n) {
        boolean isNegative = n < 0;
        long temp = Math.abs((long) n);
        long reversedNumber = 0;
        long place = 1;
        while (temp > 0) {
            long last_digit = temp % 10;
            reversedNumber = reversedNumber * 10 + last_digit;
            // Check for overflow
            if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
                return 0;
            }
            temp /= 10;
        }
        reversedNumber = isNegative ? -reversedNumber : reversedNumber;
        return (int) reversedNumber;
    }    
    public static void main(String[] args) {
        System.out.println(reverseNumber(1534236469));  // Output: 0 (due to overflow)
    }
}
