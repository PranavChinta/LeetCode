class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<String>();
        int wordStartIdx = 0;
        boolean foundWordStart = false;
        boolean foundWordEnd = false;
        for(int i = 0; i < s.length(); i++){
             if(s.charAt(i)!=' '&&(!foundWordStart)){
                wordStartIdx = i;
                foundWordStart = true;
            }
            if(foundWordStart){
                if(s.charAt(i)==' '){
                    String word = s.substring(wordStartIdx, i);
                    list.add(word);
                    foundWordStart = false;
                    wordStartIdx = 0;
                }
                else if(i==s.length()-1){
                    String word = s.substring(wordStartIdx);
                    list.add(word);
                }
            }
        }

        String ret = "";
        for(int i = list.size()-1; i >= 0; i--){
            String word = list.get(i);
            if(i==0){
                ret = ret+word;
            }
            else{
                ret = ret + word + " ";
            }
        }

        return ret;
    }
}