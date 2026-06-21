class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int res = 0;
        // O(n^2) we need to optimize so we could use two pointers
        // for(int i=0;i<n;i++){
        //     for(int j = i + 1;j<n;j++){
        //         int area = (j-i) * Math.min(heights[i],heights[j]);
        //         res = Math.max(res,area);
        //     }
        // }

        int l = 0,r = n-1;
        while(l<r){
            int area = (r-l) * Math.min(heights[l],heights[r]);
            res = Math.max(res,area);

            if(heights[l] < heights[r]) l++;
            else r--;

        }
        return res;
        
    }
}
