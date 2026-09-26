class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for(List<String> entry : knowledge) {
            map.put(entry.get(0), entry.get(1));
        }

        for(int i = 0; i < s.length(); i++) {

            StringBuilder key = new StringBuilder();

            if(s.charAt(i) == '(') {
                i++; // skip '('
                while(s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }

                if(map.containsKey(key.toString())) {
                    ans.append(map.get(key.toString()));
                } 
                else{
                    ans.append('?');
                }

            } 
            else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}