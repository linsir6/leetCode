class Main38 {
    
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            String output = countAndSay(n - 1), result = "";
            int index = 0;
            while (index < output.length()) {
                char current = output.charAt(index);
                int cursor = index, count = 0;
                while (cursor < output.length() && output.charAt(cursor) == current) {
                    cursor++;
                    count++;
                }
                char number = (char)(count + '0');
                result += number;
                result += current;
                index += count;
            }
            return result;
        }
    }
}

