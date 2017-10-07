
public class Main167 {

	public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;

        int temp;

        while (i <= j) {
            temp = numbers[i] + numbers[j];
            if (temp < target) {
                i++;
            } else if (temp > target) {
                j--;
            } else {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
        }
        return result;
    }
}