
public class mainaaa {

	public boolean isHappy(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        return number(n);
    }

    public boolean number(int n) {
        int count = n;
        HashSet<Integer> set = new HashSet<Integer>();
        while (set.add(count)) {
            int a = 0;
            while (count > 0) {
                int num = count % 10;
                a += num * num;
                count = count / 10;
            }
            if (a == 1) {
                return true;
            } else {
                count = a;
            }
        }
        return false;
    }
}
