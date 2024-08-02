public class Selection_Sort{
   public static void selection_sort(int[] nums){
    for(int i=0;i<nums.length-1;i++){
        int min=i;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]<nums[min])
                min=j;
            }
            swap(i,min, nums);
    }
   }
   public static void swap(int a, int b, int[] nums){
    int temp=nums[a];
    nums[a]=nums[b];
    nums[b]=temp;
   }
   public static void printFun(int [] nums){
    for(int i=0;i<=nums.length-1;i++){
        System.out.print(" "+nums[i]);
    }
   }
   public static void main(String[] args) {
        int[] nums = {13,9,42,53,20,2};
        System.out.println("Before Sorting");
        printFun(nums);
        selection_sort(nums);
        System.out.println();
        System.out.println("After Sorting");
        printFun(nums);
    }
}