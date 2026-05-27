class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> check = new HashMap<>();

for(int i = 0; i < nums.length; i++){
    check.put(nums[i], i);
}

        for(int i = 0;i<nums.length;i++){
            int diff = target - nums[i];
            if(check.containsKey(diff) && check.get(diff) != i){
                return new int[]{i,check.get(diff)};
            }
        }

        return new int[]{};

        
    }
}
