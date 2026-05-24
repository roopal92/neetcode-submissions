class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int len=piles.length;
        //l start with 1 and not zero bc speed cant be zero
        int l=1,r=piles[len-1];
         // right = max pile
        for (int p : piles) {
            r = Math.max(r, p);
        }
        int k=1, ans=r;

        while(l<=r){
            k=(l+r)/2;
            int val=0;    
            for(int i: piles){
                //ceil(p / k) = (p + k - 1) / k
                val+=(i+k-1)/k;
            }
            if(val<=h){
                ans =k;
            r=k-1;
             } else if(val>h)
            l=k+1;
            
            


        }
        return ans;

    }
    //complexity -> O(log(max(p))*p) log for binary search
}
