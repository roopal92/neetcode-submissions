class Solution:
    def rob(self, nums: List[int]) -> int:
        curr_high, last_high,maxi=0,0,0
        for i in range(len(nums)):
            maxi=max(last_high+nums[i], curr_high)
            last_high = curr_high
            curr_high= maxi
        return maxi;

        
        