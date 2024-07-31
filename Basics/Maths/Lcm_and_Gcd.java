public class Lcm_and_Gcd {

    // Euclideans Algorithm to find the GCD
    static long gcd(long a, long b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    // Method to find LCM
    static long lcm(long a, long b){
        long ans = (a/gcd(a, b))*b;
        return ans;
    }
    public static void main(String[] args) {
        long[] result = new long[2];
        result[0]= gcd(15, 20);
        result[1]= lcm(15, 20);
        for(int i=0; i<=result.length-1;i++){
            System.out.println("Output: "+ result[i]+ " ");
        }
        
    }
}
