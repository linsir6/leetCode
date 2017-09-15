class Main40 {
    
    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        if (nums.length == 0 || nums == null)
            return result;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target)
                list.add(i);
        if (list.size() == 0)
            return result;
        result[0] = list.get(0);
        result[1] = list.get(list.size() - 1);
        return result;
    }

}

