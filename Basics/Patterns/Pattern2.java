public class Pattern2 {
    /*

     * 
     **
     ***
     ****
     *****

     */
    public static void pattern2(){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                if(i>j)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
