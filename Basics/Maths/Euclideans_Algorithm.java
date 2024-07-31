public class Euclideans_Algorithm {
    // TC : O(log(min(a,b)))
    // SC: O(1)
    private static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
 public static void main(String[] args) {
    System.out.println("GCD=" + gcd(15,20));
 }   
}
