class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        //pop if character repeats from the set and maintain unique sliding window
        //find window size: r-l+1
        Set<Character> chars=new HashSet<>();
        int left=0,max=0;

        for(int i=0;i<s.length();i++){
           
            while(chars.contains(s.charAt(i))){
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(i));
            max=Math.max(max, i-left+1);
        } 
        return max;

    }
}
