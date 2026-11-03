class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        String sorted_string;
        ArrayList<String> li;
        char[] c;
        for(String s : strs){
            c = s.toCharArray();
            Arrays.sort(c);
            sorted_string = new String(c);
            li = map.getOrDefault(sorted_string, new ArrayList<>());
            li.add(s);
            map.put(sorted_string,li);
        }

       
        return new ArrayList<>(map.values());
    }
}
