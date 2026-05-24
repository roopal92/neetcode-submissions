class Solution {
    public int search(int[] nums, int target) {
        
        int l=0,r=nums.length-1,mid=0;

        //remember it should be <= else will miss last condition
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                l=mid+1;
                else
                r=mid-1;
        }
        return -1;
    }
}
