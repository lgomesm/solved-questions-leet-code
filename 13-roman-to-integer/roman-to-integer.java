class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = map.get(currentChar);

            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextValue = map.get(nextChar);

                if (nextValue > currentValue) {
                    result += nextValue - currentValue;
                    i++;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }
}