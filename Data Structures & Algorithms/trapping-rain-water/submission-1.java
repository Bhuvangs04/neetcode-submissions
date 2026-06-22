class Solution {
    public int trap(int[] height) {
        if(height == null){
            return 0;
        }

        int n = height.length;
        int[] lM = new int[n];
        int[] rM = new int[n];

        lM[0] = height[0];
        for(int i =1;i<n;i++){
            lM[i] = Math.max(lM[i-1],height[i]);
        }
        rM[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rM[i] = Math.max(rM[i+1],height[i]);
        }
        int res = 0;
        for(int i =0;i<n;i++){
            res += Math.min(lM[i],rM[i]) - height[i];
        }
        return res; 
    }
}