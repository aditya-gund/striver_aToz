public class Pattern8 {
    /*
                *******
                 *****
                  ***
                   *    
     */
    public static void pattern8() {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=7;j++){
            if(j>=i && j<=8-i)
           System.out.print("*");
           else
           System.out.print(" ");
            }
            System.out.println();
        }
    }
}
