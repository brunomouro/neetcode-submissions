class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        List<List<String>> finalList = new ArrayList<List<String>>();

        for(int i = 0; i < strs.length; i++){
            char[] words = strs[i].toCharArray();
            int[] alpha = new int[26];

            for(char word : words){
                alpha[word - 'a']++;
            }

            String key = Arrays.toString(alpha);

            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(strs[i]);
        }

        finalList.addAll(map.values());

        return finalList;
}
}