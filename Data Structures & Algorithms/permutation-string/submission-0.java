class Solution {
    public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;

        int[] freq = new int[26];
        int matches = 0;

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            int idx = s2.charAt(right) - 'a';
            freq[idx]--;
            if (freq[idx] == 0) matches++;

            if (right - left + 1 > s1.length()) {
                int lidx = s2.charAt(left) - 'a';
                if (freq[lidx] == 0) matches--;
                freq[lidx]++;
                left++;
            }

            if (matches == countDistinct(s1)) return true;
        }
        return false;
    }

    private int countDistinct(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!seen[c - 'a']) {
                seen[c - 'a'] = true;
                count++;
            }
        }
        return count;
    }
}
