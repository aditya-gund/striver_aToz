public class Evenly_Count_Digits {
    public static int evenlyCount(int n){
        int count=0;
        int temp=n;
        while(temp>0){
            int last_digit=temp%10;
            if(n%last_digit==0 && last_digit!=0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(evenlyCount(15478));
    }
}
