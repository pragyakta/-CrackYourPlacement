class Solution {
    public int[] twoSum(int[] nums, int target) {
//          HashMap<Integer,Integer> Map = new HashMap<Integer,Integer>();
//         for(int i = 0; i < nums.length; i++){
//             Integer Num = (Integer)(target - nums[i]);
//             if(Map.containsKey(Num)){
//                 int Return[] = {Map.get(Num), i};
//                 return Return;
//             }

//             Map.put(nums[i], i);
//         }
//         return null;
        int[] ans = new int[2];
        
        int n = nums.length;
        for(int i = 0; i< n;i++){
            int diff = target - nums[i];
            for(int j = i+1;j < n;j++){
                if(nums[j] == diff){
                    ans[0] = i;
                    ans[1] = j;
                    Arrays.sort(ans);
                    return ans;
                }
            }
        }
        
        return new int[0];
       
    }
}