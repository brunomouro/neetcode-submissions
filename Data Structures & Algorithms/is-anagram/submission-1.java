class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapT = new HashMap<Character, Integer>();

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        for(char c : arrayS){
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        for(char c : arrayT){
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        return mapS.equals(mapT);
    }
}
