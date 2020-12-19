 class ClosestElementValue{
  private int helper(int val, int[] array) {
        int gap1 = Integer.MAX_VALUE;
        int gap2 = Integer.MAX_VALUE;
        int idx = Arrays.binarySearch(array, val);
        if (idx >= 0) {
            return val;
        } else {
            idx = -1 - idx;
            if (idx != array.length)
                gap1 = Math.min(gap1, array[idx] - val);
            if (idx != 0)
                gap2 = Math.min(gap2, val - array[idx - 1]);
        }        
        return gap1<gap2?array[idx]:array[idx-1];
    }
}
