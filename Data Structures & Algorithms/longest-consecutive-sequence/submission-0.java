class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> track = new HashSet<>();
        int res = 0;
        for(int n : nums){
            track.add(n);
        }

        for(int i = 0 ;i<nums.length;i++){
            int streak = 0;
            int curr = nums[i];
            while(track.contains(curr)){
                curr++;
                streak++;
            }

            res = Math.max(res,streak);
            
        }

        return res;
        
    }
}
