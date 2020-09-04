public class ShellSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 515, 121, 2, 54, 4123, 15, 84, 3, 12, 48, 3154, 751, 62, 1547, 75, 96, 21, 75, 32};
        new ShellSort().shellSort(nums);
        for(int n: nums){
            System.out.print(n+", ");
        }
    }
    public void shellSort(int [] nums){
        for (int gap = nums.length/2; gap >0; gap/=2) {
            for (int i = gap; i < nums.length; i++) {
                for (int j = i; j > gap; j-=gap) {
                    if(nums[j]<nums[j-gap]){
                        int tmp = nums[j];
                        nums[j] = nums[j-gap];
                        nums[j-gap] = tmp;
                    }
                }
            }
        }
    }

}
