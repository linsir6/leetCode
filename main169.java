class Solution {
    public static int majorityElement(int[] num) {
        int main = num[0];
        int count = 1;

        for (int i = 1; i < num.length; i++) {
            if (main == num[i]) count++;
            else if (count > 0) count--;
            else main = num[i];
        }
        return main;
    }
}
