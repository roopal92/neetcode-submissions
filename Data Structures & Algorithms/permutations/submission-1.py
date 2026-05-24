class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        
        self.res = []
        

        def backtrack( candidate: List[int],used: Set[int]):
            if len(candidate) == len(nums):
                self.res.append(candidate[:])
                return
            for i in nums:
                if i not in used:
                    candidate.append(i)
                    used.add(i)
                    backtrack(  candidate,used)
                    candidate.pop()
                    used.remove(i)
        
        backtrack( [],set())
        return self.res