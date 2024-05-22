class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for(int i = s.length()-1; i>=0; i--){
            char curr = s.charAt(i);
            if(curr!=' '){
                length++;
            }
            else{
                if(length>0){
                    return length;
                }
            }
        }
        return length;
    }
}