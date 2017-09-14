class Main20 {
    
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                result.add(chars[i]);
            } else {
                if (result.size()==0) return false;
                Character temp = result.remove(result.size() - 1);
                if (temp == '(' && chars[i] != ')') return false;
                if (temp == '[' && chars[i] != ']') return false;
                if (temp == '{' && chars[i] != '}') return false;
            }
        }
        if (result.size() == 0) return true;
        else return false;
    }
    
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
    
}
