class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=[]
        backtrack(0,nums,[], res)
        return res

def backtrack(i:int,nums, current_val, res):

    if(i==len(nums)):
        res.append(current_val.copy())
        return

    current_val.append(nums[i])
    backtrack(i+1, nums,current_val,res)
    current_val.pop()
    backtrack(i+1, nums,current_val,res)
        