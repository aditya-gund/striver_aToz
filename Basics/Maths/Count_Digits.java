public class Count_Digits{
    // Given an integer N, return the number of digits in N.

    public static int countDigits(int n){
        // Time Complexity: O(n)
        int count=0;
        while (n>0) {
            n=n/10;
            count++;
        }
        return count;
    }
    //Optimised approach by using log10 we get the count
    public static int countLogDigits(int n){
        int count = (int)(Math.log10(n)+1);
        return count;
    }
    public static void main(String[] args) {
        // TC: O(1)
        int result=countLogDigits(34212341);
        System.out.println("Output: "+ result);
    }
}