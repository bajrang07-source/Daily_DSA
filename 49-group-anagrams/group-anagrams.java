class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        if (strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String newSorted = new String(ch);

            if(!map.containsKey(newSorted)) {
                map.put(newSorted, new ArrayList<>());
            }

            map.get(newSorted).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}