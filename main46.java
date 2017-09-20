class Main46 {
    
    private List<Integer> temp = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, nums, 0);
        return list;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void dfs(List<List<Integer>> list, int[] nums, int j) {
        if (j == nums.length) {
            for (int num : nums)
                temp.add(num);
            list.add(temp);
            temp = new ArrayList<>();
        }
        for (int i = j; i < nums.length; i++) {
            swap(nums, i, j);
            dfs(list, nums, j+1);
            swap(nums, i, j);
        }
    }
}

