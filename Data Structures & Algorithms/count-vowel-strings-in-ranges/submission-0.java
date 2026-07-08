public class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int n = words.length;
        int[] prefixCnt = new int[n + 1];

        for (int i = 0; i < n; i++) {
            String w = words[i];
            prefixCnt[i + 1] = prefixCnt[i];
            if (vowels.contains(w.charAt(0)) && vowels.contains(w.charAt(w.length() - 1))) {
                prefixCnt[i + 1]++;
            }
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            res[i] = prefixCnt[r + 1] - prefixCnt[l];
        }

        return res;
    }
}