class Solution {
    public void moveZeroes(int[] nums) {
        
        
        int j = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==0){ //count the number of zeros
                count++;
            }
            else if(nums[i]!=0){  //if number is nonzero, maintain a var start with 0 and put every integer other than 0 one by one

                nums[j]=nums[i];
                j++;
            }
        }
        while(count!=0){
            nums[j]=0;
            j++;
            count--;
        }
    }
}