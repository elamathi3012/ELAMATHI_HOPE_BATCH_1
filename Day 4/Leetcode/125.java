class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        String st = s.toLowerCase();
        st = st.replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder(st);
        String r = sb.reverse().toString();
        if(st.equals(r)) return true;
        else return false;
        
    }
}
