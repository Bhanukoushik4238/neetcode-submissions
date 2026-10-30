class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> dict = new HashMap<>();
        for (char ch: s.toCharArray()){
            dict.put(ch,dict.getOrDefault(ch,0)+1);
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // fetching length
        int l1 = s.length();
        int l2 = t.length();

        if ((l1==l2) && (dict.equals(map))){
            return true;
        }

        return false;

    }
}
