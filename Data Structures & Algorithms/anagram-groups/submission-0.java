class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(int i = 0; i < strs.length; i++){
            int[] alphabet = new int[26];

            char[] c = strs[i].toCharArray();

            for(int j = 0; j < c.length; j++){
                alphabet[c[j] - 'a']++;
            }

            String key = Arrays.toString(alphabet);

            if ( map.containsKey(key)){
                map.get(key).add(strs[i]);
                continue;
            }

            ArrayList<String> list = new ArrayList<String>();
            list.add(strs[i]);

            map.put(key, list);
        }

        ArrayList<List<String>> listaFinal = new ArrayList<List<String>>();
        listaFinal.addAll(map.values());

        return listaFinal;
    }
}
