class Solution {
    public int missingNumber(int[] nums) {
        int size=nums.length;

        int res=nums[0];

        for(int i=1;i<size;i++){
            res=res^nums[i];
        }
        int temp=res;
        for(int i=0;i<=size;i++){
            temp=temp^i;
        }

        System.out.println(temp);
         return temp;
    }
}