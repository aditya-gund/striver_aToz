public class Pattern10 {
    // Upper Triangle
    public static void upperTriangle(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i>=j)
                    System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    // Lower Triangle
    public static void lowerTriangle(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j>=1 && j<=5-i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();    
        }
        
    }
    public static void main(String[] args) {
        Pattern10 p1 = new Pattern10();
        p1.upperTriangle();
        p1.lowerTriangle();
    }

}
