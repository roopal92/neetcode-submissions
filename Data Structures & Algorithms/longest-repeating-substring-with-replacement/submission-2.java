class Solution {
    public int characterReplacement(String s, int k) {
        //use hashmap to note the count of chars
        //left n right pointer
         Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int result = 0;

        //start right from 0
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(c));

            // if replacements needed > k, shrink window
            //window size- max frequent elem <=k else remove left character
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;

    }
}
