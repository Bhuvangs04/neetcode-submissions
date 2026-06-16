class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> track = new HashMap<>();

        for(int i = 0;i<numbers.length;i++){
            int temp = target - numbers[i];
            if(track.containsKey(temp)){
                return new int[]{track.get(temp),i+1};
            }
            track.put(numbers[i],i+1);
        }

        return new int[0];
        
    }
}
