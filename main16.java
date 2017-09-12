class Solution {
   
	public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closest = target - nums[0] - nums[1] - nums[2];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            int newTarget = target - nums[i];

            while (l < r) {
                if (nums[l] + nums[r] == newTarget) {
                    return target;
                }

                int diff = newTarget - nums[l] - nums[r];
                if (Math.abs(diff) < Math.abs(closest)) {
                    closest = diff;
                }

                if (nums[l] + nums[r] < newTarget) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return target - closest;
    }
}
