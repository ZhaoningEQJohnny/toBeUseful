public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 515, 121, 2, 54, 4123, 15, 84, 3, 12, 48, 3154, 751, 62, 1547, 75, 96, 21, 75, 32};
        new InsertionSort().insertionSort(nums);
        for(int n: nums){
            System.out.print(n+", ");
        }
    }
    public void insertionSort(int [] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if(nums[j]<nums[j-1]){
                    int tmp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = tmp;
                }
            }
        }
    }
}
