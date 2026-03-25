class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long v = 1L*length*width*height;
        double g = Math.pow(10,9);
        double h = Math.pow(10,4);
        boolean f = (length>=h||width>=h||height>=h||mass>=h||v>=g);
        boolean d = (mass>=100);
        if(f&d) return "Both";
        else if(f)  return "Bulky";
        else if(d)return "Heavy";
        else return "Neither";
    }
}