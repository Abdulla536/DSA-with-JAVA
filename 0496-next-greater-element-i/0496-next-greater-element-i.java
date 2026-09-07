class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        int count[]=new int[10001];
        // Arrays.fill(count, -1);

        for (int i = m-1; i>=0; i--) {
            while (st.size() > 0 && nums2[i] > st.peek()) {
               // count[st.peek()]=nums2[i];
                st.pop();
            }
            if(st.size()>0)
            count[nums2[i]]=st.peek();
            else
            count[nums2[i]]=-1;
            st.push(nums2[i]);
        }


        for(int i=0;i<n;i++){
            ans[i]=count[nums1[i]];
        }
        return ans;
      



       

    }
}