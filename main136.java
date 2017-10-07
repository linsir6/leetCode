
public class Main136 {

	public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (dict.containsKey(nums[i])) {
                dict.put(nums[i], dict.get(nums[i]) + 1);
            } else {
                dict.put(nums[i], 1);
            }
        }

        for(int i : dict.keySet()){
            if (dict.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public int singleNumber2(int[] nums) {
        int result = 1;
        for(int i = 0;i<nums.length;i++){
            result ^= nums[i]; 
        }
        return result;
    }
}