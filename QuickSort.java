public class QuickSort {
    public static void main(String[] args) {
        int [] nums = new int[]{1,515,121,2,54,4123,15,84,3,12,48,3154,751,62,1547,75,96,21,75,32};
        new QuickSort().quickSort(nums,0,nums.length-1);
        for (int num: nums) {
            System.out.print(num+", ");
        }
    }
    public void quickSort(int [] nums, int low , int high){
        if(low>=high){
            return;
        }
        int pivotIndex = partition(nums,low,high);
        quickSort(nums,low,pivotIndex-1);
        quickSort(nums,pivotIndex+1,high);
    }
    public int partition(int [] nums, int low, int high){
        int pivot = nums[high];
        int j = low;
        for (int i = low; i <= high ; i++) {
            if(nums[i]<pivot){
                int tmp = nums[j];
                nums[j] =  nums[i];
                nums[i] = tmp;
                j++;
            }
        }
        int tmp = nums[j];
        nums[j] =  pivot;
        nums[high] = tmp;
        return j;
    }
}
