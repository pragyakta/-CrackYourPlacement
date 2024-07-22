class Solution {
    public int findDuplicate(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i+1){ //if number is on its position then continue
                continue;
            }
            else if(nums[nums[i]-1] != nums[i]){  //put the number on this position to its original place  
                int t = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = t;
                i--;
            }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){ //After sorting if still there is some element not in there place then consider that as duplicate
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}