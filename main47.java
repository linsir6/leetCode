class Main47 {
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        //Arrays.sort(nums);
        dfs(list, nums, 0);
        return list;
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private static void dfs(List<List<Integer>> list, int[] nums, int j) {
        if (j == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            list.add(temp);
            temp = new ArrayList<>();
        }
        List<Integer> flags = new ArrayList<>();
        for (int i = j; i < nums.length; ++i) {
            if (!flags.contains(nums[i])) {
                flags.add(nums[i]);
                swap(nums, i, j);
                dfs(list, nums, j + 1);
                swap(nums, i, j);
            }
        }
    }
}

