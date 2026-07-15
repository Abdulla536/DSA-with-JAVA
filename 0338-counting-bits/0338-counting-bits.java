class Solution {
    public int[] countBits(int m) {
        int arr[] = new int[m+1];
        arr[0]=0;

        for (int i = 1; i <=m; i++) {
          arr[i]=arr[i>>1]+(i&1);
        }
         return arr;
    }
   
}