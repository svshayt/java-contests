package com.svshayt.leetcode.problemset.problem_205;

import java.util.HashMap;
import java.util.Map;

public class Solution205 {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Character> res = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            map.merge(sChar, 1, Integer::sum);
            if (res.containsKey(tChar)) {
                char local = res.get(tChar);
                int value = map.get(local) - 1;
                if (value < 0) return false;
                map.put(local, value);
            } else {
                res.put(tChar, sChar);
                map.put(sChar, map.get(sChar) - 1);
            }

        }
        return map.keySet().size() == res.keySet().size() && map.values().stream().noneMatch(x -> x != 0);
    }
}
