class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
         Map<String , List<String>> map =  new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            char arrChar[]=arr[i].toCharArray();
            Arrays.sort(arrChar);
            String sorted = String.valueOf(arrChar);
            if(map.containsKey(sorted)) {
                List<String> addedValue = map.get(sorted);
                    addedValue.add(arr[i]);
                    map.put(sorted, addedValue);
            }else {
                ArrayList<String> a = new ArrayList<>();
                a.add(arr[i]);
                //here we cant use List.of() as it creates unmodifiable  list and we cant add. hence use new Arraylist
                map.put(sorted, a);
            }
        }
    
    List<List<String>> vals= map.values().stream().collect(Collectors.toList());
    return vals;
    }
}
