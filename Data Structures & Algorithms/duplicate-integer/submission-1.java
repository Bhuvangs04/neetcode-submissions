class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dd = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            if(dd.contains(nums[i])){
                return true;
            }else{
                dd.add(nums[i]);
            }
        }

        return false;
        
    }
}