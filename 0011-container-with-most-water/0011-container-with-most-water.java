class Solution {
    public int maxArea(int[] height) {
     int l=0;
     int r=height.length-1;
     int max=Integer.MIN_VALUE;

     while(l<r){
        int w=r-l;
        int ans=Math.min(height[r],height[l]);

        max=Math.max(ans*w,max);

        if(height[l]<height[r]){
            l++;
        }else{
            r--;
        }
     }
     return max;
    }
}