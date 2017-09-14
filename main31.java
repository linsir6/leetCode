class Main31 {
    
    public void nextPermutation(int[] nums) {
        int index = nums.length - 1;
        while (index > 0 && nums[index] <= nums[index - 1]) {
            --index;
        }
        if (index == 0) {
            Arrays.sort(nums);
            return;
        }
        int second = Integer.MAX_VALUE, secondIndex = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= index - 1; --i) {
            if (nums[i] > nums[index - 1] && nums[i] < second) {
                second = nums[i];
                secondIndex = i;
            }
        }
        int tmp = nums[index - 1];
        nums[index - 1] = nums[secondIndex];
        nums[secondIndex] = tmp;
        Arrays.sort(nums, index, nums.length);
    }
}
