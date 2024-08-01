import java.util.ArrayList;
import java.util.List;

public class Print_All_Divisors {

    public static List<Integer> allDivisors(int n){
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> ans = allDivisors(36);
        System.out.print("Output: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i < ans.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
