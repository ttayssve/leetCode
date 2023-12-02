package org.code;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));

        String s1 = "()[]{}";
        System.out.println(isValid(s1));

        String s2 = "(]";
        System.out.println(isValid(s2));

        String s3 = "([)]";
        System.out.println(isValid(s3));
    }

    public static boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                list.add(c);
            } else if (c == ')' && list.contains('(') && list.lastIndexOf('(') == list.size() - 1) {
                list.remove(list.lastIndexOf('('));
            } else if (c == ']' && list.contains('[') && list.lastIndexOf('[') == list.size() - 1) {
                list.remove(list.lastIndexOf('['));
            } else if (c == '}' && list.contains('{') && list.lastIndexOf('{') == list.size() - 1) {
                list.remove(list.lastIndexOf('{'));
            } else {
                return false;
            }
        }
        return list.isEmpty();
    }
}
