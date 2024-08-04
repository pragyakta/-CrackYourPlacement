class Solution {
    public int maxArea(int[] height) {
//         int n = height.length;
//         int lo = 0;
//         int hi = n-1;
         
//         int maxArea = 0;
//         while(lo < hi){

//             maxArea = Math.max(maxArea, Math.min(height[lo],height[hi])* (hi-lo)) ; //minimum of lo and hi multiply width hi -lo
            
//             if(height[lo] < height[hi]){  //height of low is less than height of high 
//                 lo++;
//             }
//             else{
//                 hi--;
//             }
//         } 
//         return maxArea;  
        
        int n = height.length;
        int i = 0;
        int j = n-1;
        int max = 0;
        while(i < j){
            
            max = Math.max(max, Math.min(height[i], height[j])*(j - i));
            
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        
        return max;
    }
}