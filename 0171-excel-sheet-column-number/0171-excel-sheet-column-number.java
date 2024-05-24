class Solution {
    public int titleToNumber(String columnTitle) {
        int col = 0;
        int mult = columnTitle.length()-1;
        for(int i = 0; i < columnTitle.length(); i++){
            char curr = columnTitle.charAt(i);
            int val = ((int)curr)-64;
            col = col+(val*(int)Math.pow(26, mult));
            mult--;
        }
        return col;
    }
}