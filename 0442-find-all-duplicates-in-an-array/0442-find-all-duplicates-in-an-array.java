class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list= new ArrayList<>();
        
        // int[] arr =new int [n+1];
        // Arrays.fill(arr, 0);
        // for(int i = 0 ; i < n ; i++){
        //     arr[nums[i]]++;
        // }
        // for(int i = 0 ; i <= n ; i++){
        //     if(arr[i]>1){
        //         list.add(i);
        //     }
        // }
        // return list;
        
        for(int i = 0;i < n; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                list.add(Math.abs(nums[i]));
            }else{
                nums[index]  = -nums[index];
            }
        }
        return list;
    }
}