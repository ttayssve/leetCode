package org.code;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));

        String s1 = "IV";
        System.out.println(romanToInt(s1));

        String s2 = "IX";
        System.out.println(romanToInt(s2));

        String s3 = "LVIII";
        System.out.println(romanToInt(s3));

        String s4 = "MCMXCIV";
        System.out.println(romanToInt(s4));
    }

    public static int romanToInt(String s) {
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        int romanToInt = 0;
        for (int i=0; i<s.length(); i++) {
            if ('I' == s.charAt(i) &&
                    ((i+1) < s.length()) &&
                    ('X' == s.charAt(i+1) || 'V' == s.charAt(i+1))) {
                romanToInt += roman.get(String.valueOf(s.charAt(i+1))) - 1;
                i = i + 1;
            }
            else if ('X' == s.charAt(i) &&
                    (i+1) < s.length() &&
                    ('L' == s.charAt(i+1) || 'C' == s.charAt(i+1))) {
                romanToInt += roman.get(String.valueOf(s.charAt(i+1))) - 10;
                i = i + 1;
            }
            else if ('C' == s.charAt(i) &&
                    (i+1) < s.length() &&
                    ('D' == s.charAt(i+1) || 'M' == s.charAt(i+1))) {
                romanToInt += roman.get(String.valueOf(s.charAt(i+1))) - 100;
                i = i + 1;
            } else {
                romanToInt += roman.get(String.valueOf(s.charAt(i)));
            }
        }
        return romanToInt;
    }
}
