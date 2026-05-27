class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> isA_s = new HashMap<>();
        HashMap<Character,Integer> isA_t = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(isA_s.containsKey(ch)){
                isA_s.put(ch,isA_s.get(ch)+1);
            }else{
                isA_s.put(ch,1);
            }
        }
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);

            if(isA_t.containsKey(ch)){
                isA_t.put(ch,isA_t.get(ch)+1);
            }else{
                isA_t.put(ch,1);
            }
        }

        if(isA_s.equals(isA_t)){
            return true;
        }

        return false;
    

    }
}
