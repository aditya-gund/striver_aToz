public class Check_Palindrome {
    // Method to reverse the number
    public static int reverseInteger(int n){
        boolean isNegative=n<0; // to check the num is -Ve or +Ve
        long temp=Math.abs(n);
        long reverseNumber = 0;
        while (temp>0) {
            long last_digit = temp%10;
            reverseNumber=reverseNumber*10+last_digit;
            if(reverseNumber>Integer.MAX_VALUE || reverseNumber<Integer.MIN_VALUE){
                return 0;
            }
            temp/=10;
        }
        return (int)reverseNumber;
    }
    // Check the given number is palindrome or not?
    private static boolean isPalindrome(int n){
        if(n==reverseInteger(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Reversed Number:" + reverseInteger(-1234554321));
        System.out.println("Is Palindrom: "+ isPalindrome(1234554321));
    }
}
