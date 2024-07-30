public class Pattern5 {
    /*
     
    *****
    ****
    ***
    **
    *


     */
    public static void pattern5(){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++)
            {
                if(i<j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
}
