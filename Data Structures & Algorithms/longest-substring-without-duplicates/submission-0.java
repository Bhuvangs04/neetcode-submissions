class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> track = new HashSet<>();
        int res = 0,l=0;

        for(int r = 0;r<s.length();r++){
            while(track.contains(s.charAt(r))){
                track.remove(s.charAt(l));
                l++;
            }
            track.add(s.charAt(r));
            res = Math.max(res,r - l + 1);
        }

        return res;
        
        
    }
}
