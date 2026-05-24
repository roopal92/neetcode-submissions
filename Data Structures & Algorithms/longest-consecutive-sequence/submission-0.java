class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();

        for(int n: nums)
            set.add(n);

        int max=0;
        for(int n: nums)
            if(!set.contains(n-1)){
                int val=0;
                while(set.contains(n)){
                    ++val;
                    ++n;
                }
                max= Math.max(val,max);
            }
        return max;
    }
}
