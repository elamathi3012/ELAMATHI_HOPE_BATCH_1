import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char [] c  = s.toCharArray();
        char [] f = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(f);
        String e = new String(c);
        String w = new String(f);
         return e.equals(w);
    }
}