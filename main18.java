class Main18 {
   
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                List<Integer> list;
                int lo = j + 1, hi = nums.length - 1, temp = target - (nums[i] + nums[j]);
                while (lo < hi) {
                    if (nums[lo] + nums[hi] > temp) {
                        hi--;
                    } else if (nums[lo] + nums[hi] < temp) {
                        lo++;
                    } else {
                        list = new ArrayList<>(4);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[lo]);
                        list.add(nums[hi]);
                        result.add(list);
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (hi > lo && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    }
                }
                while (j < nums.length - 2 && nums[j] == nums[j + 1]) {
                    j++;
                }
            }
            while (i < nums.length - 3 && nums[i] == nums[i + 1]) i++;
        }
        return result;
    }

}
