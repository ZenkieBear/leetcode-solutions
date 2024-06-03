package cn.zenkie.solution;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * The solution for leetcode-17: Letter Combinations of a Phone Number
 */
class LetterCombinations {

    final Map<Integer, String> keymap = new HashMap<>();

    public LetterCombinations() {
        keymap.put(2, "abc");
        keymap.put(3, "def");
        keymap.put(4, "ghi");
        keymap.put(5, "jkl");
        keymap.put(6, "mno");
        keymap.put(7, "pqrs");
        keymap.put(8, "tuv");
        keymap.put(9, "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>(), dst = new LinkedList<>();

        // Check if the digits is empty
        if (digits == null || digits.isEmpty()) return dst;

        // Check if the digits is between 2-9
        for (int i = 0; i < digits.length(); i++) {
            char c = digits.charAt(i);
            if (c < '2' || c > '9') {
                return dst;
            }
        }

        // Recursive
        if (digits.length() > 1) {
            res = letterCombinations(digits.substring(1));
        }

        // Find all characters belongs to the first digit(the key number)
        String keyStr = keymap.get(digits.charAt(0) - '0');
        if (digits.length() == 1) {
            for (int i = 0; i < keyStr.length(); i++){
                dst.add(keyStr.substring(i, i + 1));
            }
        }

        // Combine the key-characters and sub-key-string
        for (int i = 0; i < keyStr.length(); i++) {
            for (String c : res) {
                dst.add(keyStr.charAt(i) + c);
            }
        }

        return dst;
    }
}