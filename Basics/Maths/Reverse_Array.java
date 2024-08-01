public class Reverse_Array {
    public static void reverseArray(int[] nums){
       int startIndex=0;
       int endIndex=nums.length-1;
       while (startIndex<endIndex) {
        int temp=nums[startIndex];
        nums[startIndex]=nums[endIndex];
        nums[endIndex]=temp;
        startIndex++;
        endIndex--;
       }
       
    }
    public static void main(String[] args) {
        int[]nums={10,20,30,40,50}; 
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+ nums[i]);
        }   
        System.out.println();
        reverseArray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+ nums[i]);
        }
        
    }
}
