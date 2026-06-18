class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int res = 0;

        for(int i=0;i<n;i++){
            for(int j = i + 1;j<n;j++){
                int area = (j-i) * Math.min(heights[i],heights[j]);
                res = Math.max(res,area);
            }
        }

        return res;
        
    }
}
