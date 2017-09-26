public class Main60 {

	public String getPermutation(int n, int k) {
        char[] nums = new char[]{'1','2','3','4','5','6','7','8','9'};
        String tmp = "";
        for(int i=0;i<n;i++) {
            tmp += nums[i];
        }
        StringBuffer s = new StringBuffer(tmp);
        String r = "";
        while(k>0&&!s.toString().equals("")) {
            // 计算 (n-1)的排列个数cnt
            int cnt = 1, i = s.length()-1;
            while(i > 1) {
                cnt*=i;
                i-=1;
            }
            int pos = (k-1)/cnt;
            r += s.charAt(pos);
            s = s.deleteCharAt(pos);
            k -= pos * cnt;
        }
        return r;
    }
}