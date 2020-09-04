public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 515, 121, 2, 54, 4123, 15, 84, 3, 12, 48, 3154, 751, 62, 1547, 75, 96, 21, 75, 32};
        new BubbleSort().bubbleSort(nums);
        for(int n: nums){
            System.out.print(n+",");
        }
    }
    public void bubbleSort(int [] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[i]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

}
