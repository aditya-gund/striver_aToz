public class Armstrong_Number {
    // TC: O(logn) Math.pow()-> log10digits
    // SC: O(1)
    public static boolean isArmStrong(int n){
            int temp=Math.abs(n);
            int sum=0;
            int k = String.valueOf(temp).length();
            while (temp>0) {
                int last_digit=temp%10;
                sum += Math.pow(last_digit, k);
                temp/=10;
            }        
            return sum==n ? true : false;
    }
    public static void main(String[] args) {
        System.out.println("Output: " + isArmStrong(153));
    }
}
