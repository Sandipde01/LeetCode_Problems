class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(hm.containsKey(c)){
                if(hm.get(c) == 1) {
                hm.remove(c);
                }
                else{
                 hm.put(c, hm.get(c)-1 );
                }
            }
            else return false;
        }
        return hm.isEmpty();
    }
}