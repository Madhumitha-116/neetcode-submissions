class Solution {
    public int maxArea(int[] heights) {
        int left=0;int right=heights.length-1;
        int maxwater=0;
        while(left<right){

            int hgt=Math.min(heights[left],heights[right]);
            int width=right-left;
            int water=hgt*width;
             maxwater=Math.max(water,maxwater);
             if(heights[left]<heights[right]){
                left++;
             }
             else{
                right--;
             }
        }
        return maxwater;

    }
}
