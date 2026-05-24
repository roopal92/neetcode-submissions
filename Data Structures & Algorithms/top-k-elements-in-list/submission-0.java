class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq= new HashMap<>();
        for(int i: nums){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }

        List<Integer>[] values = new List[nums.length+1];
        int []res= new int[k];
        for(int i:freq.keySet()){
            int val=freq.get(i);
            if(values[val]==null)
                 values[val]=new ArrayList<>();
 values[val].add(i);
          
        }

        int index=0;
        for(int i=values.length-1;i>0 && index<k;i--){
            if(values[i]!=null)
            for(int b:values[i]){
                res[index++]=b;
                if (index == k) break;
            }
        }
        return res;
    }
}
