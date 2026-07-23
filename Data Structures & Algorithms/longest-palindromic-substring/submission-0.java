class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check odd-length palindromes (e.g. "racecar")
            int len1 = expandFromCenter(s, i, i);
            // Check even-length palindromes (e.g. "noon")
            int len2 = expandFromCenter(s, i, i + 1);
            
            int maxLen = Math.max(len1, len2);
            
            // Update boundaries if we found a longer one
            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of valid palindrome
    }
}
