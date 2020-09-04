public class MergeSort {
    public static void main(String[] args) {
        int [] nums = new int[]{1,515,121,2,54,4123,15,84,3,12,48,3154,751,62,1547,75,96,21,75,32};
        int [] tmp = new int [nums.length];
        new MergeSort().mergeSort(nums,0,nums.length-1,tmp);
        for (int num: nums) {
            System.out.print(num+", ");

        }
    }
    public void mergeSort(int [] nums, int low, int high, int [] tmp){
        if(low>=high) return;
        int mid = low + (high-low)/2;
        mergeSort(nums,low,mid,tmp);
        mergeSort(nums,mid+1,high,tmp);
        merge(nums,low,mid,high,tmp);
    }
    public void merge(int [] nums, int low, int mid, int high, int [] tmp){
        for (int i = low; i <= high; i++) {
            tmp[i] = nums[i];
        }
        int i = low;
        int j = mid+1;
        for (int k = low; k <= high; k++) {
            if(i==mid+1){
                //left over boundary
                nums[k] = tmp[j];
                j++;
            }else if (j==high+1){
                //right over boundary
                nums[k] = tmp[i];
                i++;
            }else if (tmp[i]<tmp[j]){
                nums[k] = tmp[i];
                i++;
            }else{
                nums[k] = tmp[j];
                j++;
            }
        }
    }
}
