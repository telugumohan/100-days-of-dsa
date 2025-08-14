class Solution {
    public String largestGoodInteger(String num) {
        int d = -1;
        for(int i = 0; i <= num.length()-3; i++) {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                d = Math.max(d, num.charAt(i)-'0');
            }
        }
        if(d == -1) return "";
        if(d == 0) return "000";
        return (d*100 + d*10 + d)+"";
    }
}