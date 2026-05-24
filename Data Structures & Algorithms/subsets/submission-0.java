class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>>  res= new ArrayList<>();
        backtrack(0, new ArrayList<>(), nums, res);
        return res;
    }

    private void backtrack(int i, List<Integer> current,  int[] nums,
    List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(current));
            return ;
        }
        current.add(nums[i]);
        backtrack(i+1, current, nums,res);
        current.remove(current.size()-1);
        backtrack(i+1, current, nums,res);
        
    }
        
}
