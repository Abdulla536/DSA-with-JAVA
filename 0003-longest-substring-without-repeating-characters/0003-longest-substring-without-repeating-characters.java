class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int n=s.length();
       Set<Character>set=new HashSet<>();

       int l=0;
       for(int i=0;i<n;i++){
        if(!set.contains(s.charAt(i))){
            set.add(s.charAt(i));
            ans=Math.max(ans,i-l+1);
        }
        else{
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));

        }
       }

     
        //return ans;
       

        return ans;
       
    }
}