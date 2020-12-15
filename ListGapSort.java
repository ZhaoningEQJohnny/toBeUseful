class ListGapSort{
     public static void quickSort(List<Integer> list1, List<Integer> list2, int low, int high){
        if(low>=high) return;
        int pivot = partition(list1,list2,low,high);
        quickSort(list1, list2, low, pivot-1);
        quickSort(list1, list2, pivot+1, high);
    }
    public static int partition(List<Integer> list1, List<Integer> list2, int low, int high){
        int npivot = list2.get(high);
        int apivot = list1.get(high);
        int j = low;
        for(int i =low; i<=high;i++){
            int ni = list2.get(i);
            int nj = list2.get(j);
            int ai = list1.get(i);
            int aj = list1.get(j);
            if(ni-ai<npivot-apivot){
                list2.set(i,nj);
                list2.set(j,ni);
                list1.set(j,ai);
                list1.set(i,aj);
                j++;
            }
        }
        int nj = list2.get(j);
        int aj = list1.get(j);
        list2.set(high,nj);
        list2.set(j,npivot);
        list1.set(high,aj);
        list1.set(j,apivot);
        return j;
    }
}
