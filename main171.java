class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        char[] arrays = s.toCharArray();
        for (int i = arrays.length - 1, flag = 0; i >= 0; i--)
            result += (arrays[i] - 64) * Math.pow(26, flag++);
        return result;
    }
}