public class Main67 {

	public static String addBinary(String a, String b) {

		StringBuilder result = new StringBuilder();
		char[] as = a.toCharArray();
		char[] bs = b.toCharArray();
		int flag = 0;

		int i = as.length - 1, j = bs.length - 1;
		int c;
		while (i >= 0 && j >= 0) {
			c = as[i] + bs[j];
			switch (c) {
			case 96:
				if (flag == 0) {
					result.append(0);
				} else {
					result.append(1);
				}
				flag = 0;
				break;

			case 97:
				if (flag == 0) {
					result.append(1);
					flag = 0;
				} else {
					result.append(0);
					flag = 1;
				}

				break;

			case 98:
				if (flag == 0) {
					result.append(0);
				} else {
					result.append(1);
				}
				flag = 1;
				break;
			}
			i--;
			j--;

		}
		if (i == -1) {
			while (j >= 0) {
				if (flag == 1) {
					if (bs[j] == '0') {
						result.append('1');
						flag = 0;
					} else {
						result.append(0);
						flag = 1;
					}
				} else {
					result.append(bs[j]);
				}
				j--;
			}
		}

		if (j == -1) {
			while (i >= 0) {
				if (flag == 1) {
					if (as[i] == '0') {
						result.append('1');
						flag = 0;
					} else {
						result.append(0);
						flag = 1;
					}
				} else {
					result.append(as[i]);
				}
				i--;
			}
		}
		if (flag == 1) {
			result.append('1');
		}
		return result.reverse().toString();
	}
}