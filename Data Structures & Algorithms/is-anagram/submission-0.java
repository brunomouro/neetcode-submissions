class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> countT = new HashMap<Character, Integer>();

        for(int i = 0; i < t.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        if(!countS.equals(countT)){
            return false;
        }

        return true;

    }
}
