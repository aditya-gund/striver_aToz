public class Check_Is_Prime {
    // TC: O(n)
    // SC: O(1)
    // public static boolean isPrime(int n){
    //     int count=0;
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             count=count+1;
    //         }
    //     }
    //     if(count==2){
    //         return true;
    //     }
    //     return false;
    // }

    // TC: O(Math.sqrt(n))
    // SC: O(1)
    public static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count=count+1;
                if(n/i!=i){
                    count=count+1;
                }
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Output: "+ isPrime(1485));
    }
}
