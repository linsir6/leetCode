class Main49 {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, Integer> helper = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (helper.containsKey(key)) {
                list.get(helper.get(key)).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                list.add(temp);
                helper.put(key, list.size() - 1);
            }
        }
        return list;
    }
}

