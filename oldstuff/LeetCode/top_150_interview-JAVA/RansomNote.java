// https://leetcode.com/problems/ransom-note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            if (map.containsKey(ch)) {
                int counter = map.get(ch);
                map.put(ch, counter + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : ransomNote.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) < 1) {
                return false;
            } else {
                int counter = map.get(ch);
                map.put(ch, counter - 1);
            }
        }
        return true;
    }
}