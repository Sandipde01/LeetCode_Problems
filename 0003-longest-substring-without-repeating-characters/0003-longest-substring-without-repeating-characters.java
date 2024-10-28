class Solution {
    public int lengthOfLongestSubstring(String s) {
        int f = 0;
        int l = 0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (hs.contains(ch) && !hs.isEmpty()) {
                hs.remove(s.charAt(f));
                f++;
            }
            hs.add(ch);
            int length = (l - f) + 1;
            max = Math.max(max, length);
            l++;
        }
        return max;

    }
}