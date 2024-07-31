import java.util.Stack;

public class Reverse_Number {
    public static int reverseNumber(int n) {
        boolean isNegative = n < 0;
        long temp = Math.abs((long) n);
        Stack<Long> st = new Stack<>();
        
        while (temp > 0) {
            long last_digit = temp % 10;
            st.push(last_digit);
            temp /= 10;
        }
        
        long reversedNum = 0;
        long place = 1;
        
        while (!st.isEmpty()) {
            reversedNum += st.pop() * place;
            place *= 10;
            
            // Check for overflow
            if (reversedNum > Integer.MAX_VALUE) {
                return 0;
            }
        }
        
        reversedNum = isNegative ? -reversedNum : reversedNum;
        
        // Check for overflow
        if (reversedNum < Integer.MIN_VALUE || reversedNum > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) reversedNum;
    }
    
    public static void main(String[] args) {
        System.out.println(reverseNumber(1534236469));  // Output: 0 (due to overflow)
    }
}
