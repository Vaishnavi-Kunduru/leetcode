class Solution {
    public int maxSubArray(int[] nums) {
        int max= nums[0];
        int len;
    
        for(int i = 0; i<nums.length; i++){
             len = 0;
            for(int j = i; j<nums.length; j++){
                len = len + nums[j];
                if(len > max)
                max = len;
            
            } 
    }

        return max;
    }
}
