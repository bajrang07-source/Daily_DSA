class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(!map.containsKey(ch)) return false;

            int val = map.get(ch);
            if(val<1) return false;
            map.put(ch, val-1);
        }
        return true;
    }
}