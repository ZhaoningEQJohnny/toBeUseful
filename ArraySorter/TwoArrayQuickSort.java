class TwoArrayQuickSort{
    public static void quickSort(List<Integer> list1, List<Integer> list2, int low, int high){
        if(low>=high) return;
        int pivot = partition(list1,list2,low,high);
        quickSort(list1, list2, low, pivot-1);
        quickSort(list1, list2, pivot+1, high);
    }
    public static int partition(List<Integer> list1, List<Integer> list2, int low, int high){
        int pivot1 = list1.get(high);
        int pivot2 = list2.get(high);
        int j = low;
        for(int i =low; i<=high;i++){
            int i1 = list1.get(i);
            int j1 = list1.get(j);
            int i2 = list2.get(i);
            int j2 = list2.get(j);
            if(i1<pivot1){
                list1.set(i,j1);
                list1.set(j,i1);
                list2.set(j,i2);
                list2.set(i,j2);
                j++;
            }
        }
        int nj = list1.get(j);
        int aj = list2.get(j);
        list1.set(high,nj);
        list1.set(j,pivot1);
        list2.set(high,aj);
        list2.set(j,pivot2);
        return j;
    }

}
