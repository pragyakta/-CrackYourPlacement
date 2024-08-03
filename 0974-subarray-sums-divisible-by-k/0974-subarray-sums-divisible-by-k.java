class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int[] mod =new int[k];
        // Arrays.fill(mod,0);
        // int cum=0;
        // for(int i=0;i<nums.length;i++){
        //     cum += nums[i];
        //     mod[((cum % k) + k ) % k]++;
        // }
        // int count=0;
        // for(int i = 0; i < k ; i++){
        //     if(mod[i] > 1){
        //         count += (mod[i] * (mod[i]-1))/2;
        //     }
        // }
        // count += mod[0];
        // return count;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int i = 0;i < n;i++){
            
            sum += nums[i];
            
            int mod = sum % k;
            if(mod < 0){
                mod += k;
            }
            
            if(map.containsKey(mod)){
                count += map.get(mod);
                map.put(mod, map.get(mod)+1);
            }else{
                map.put(mod, 1);
            }
        }
        return count;
    }
}