class Main53 {
    
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int max = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (max + nums[i] < nums[i]) max = nums[i];
            else max = max + nums[i];
            if (max > result) result = max;
        }
        return result;
    }

}

