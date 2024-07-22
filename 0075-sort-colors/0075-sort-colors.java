class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int i=0;
        while(mid <= high){
            switch(nums[mid]){
                case 0:{            //place the low flag right at last zero element
                    i = nums[low];
                    nums[low] = nums[mid];
                    nums[mid]=i;
                    low++;
                    mid++;
                    break;
                }
                case 1:{            //if one the just increase 
                    mid++;
                    break;
                }
                case 2:{            //if two then place it at the start of two colour 
                    i = nums[high]; 
                    nums[high]=nums[mid];
                    nums[mid]=i;
                    high--;
                }       

            }
        }
    }
}