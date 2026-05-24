class Solution {
    public int characterReplacement(String s, int k) {
        //use hashmap to note the count of chars
        //left n right pointer
         Map<Character, Integer> count = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, count.get(c));

            // if replacements needed > k, shrink window
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;

    }
}
