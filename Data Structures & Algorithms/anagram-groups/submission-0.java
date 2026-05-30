class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> count = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            count.putIfAbsent(sortedS, new ArrayList<>());
            count.get(sortedS).add(s);
        }

        return new ArrayList<>(count.values());
        
    }
}
