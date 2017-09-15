class Main39 {
    
    public List<List<Integer>> combinationSum(int[] candidates,
            int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
 
    public void getResult(List<List<Integer>> result,
            List<Integer> current, int[] candiates, int target, int start) {
        if (target > 0) {
            for (int i = start; i < candiates.length && target >= candiates[i]; i++) {
                current.add(candiates[i]);
                getResult(result, current, candiates, target - candiates[i], i);
                current.remove(current.size() - 1);
            }
        } else if (target == 0) {
            result.add(new ArrayList<Integer>(current));
        }
    }
}

