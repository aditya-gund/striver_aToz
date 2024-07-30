public class Pattern9 {

    /* 
    *    
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 




    */
    public static void pattern9(){
        // Upper Part
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
        if(j>=6-i && j<=4+i)
        System.out.print("*");
        else
        System.out.print(" ");
            }
        System.out.println();
        }
        // Lower Part
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
        if(j>=i && j<=8-i)
        System.out.print("*");
        else
        System.out.print(" ");
            }
        System.out.println();
        }
    }
}
