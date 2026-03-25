class Solution {
    public String interpret(String command) {
        String e = command.replace("()","o");
        String r = e.replace("(","");
        return r.replace(")","");
    }
}