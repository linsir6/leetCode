class Main35 {
    
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || nums[0] >= target) return 0;

        if (nums[nums.length - 1] == target) return nums.length - 1;

        if (nums[nums.length - 1] < target) return nums.length;

        for (int i = 0; i < nums.length - 1; i++) {
            if (i == nums.length - 1) break;
            if (nums[i] <= target && nums[i + 1] >= target) return i + 1;
        }
        return -1;
    }
}
