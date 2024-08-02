/**
 * Bubble_Sort
 */
public class Bubble_Sort {
    public static void bubble_sort(int[] nums){
        int n=nums.length;
        for(int i=n-1;i>=1;i--){
            int max=i;
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[max]){
                    max=j;
                }
            }
            swap(i, max, nums);
        }
    }
    public static void swap(int num1,int num2, int[] nums){
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
    public static void printMethod(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums={13, 46, 24, 52, 20, 9};
        System.out.println("Before Sorting");
        printMethod(nums);
        System.out.println("After Sorting");
        bubble_sort(nums);
        printMethod(nums);
    }
    
}