class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            boolean skip = false;
            if(i+1 < s.length()){
                String sub = s.substring(i, i+2);
                if(sub.equals("IV")){
                    sum+=4;
                    i++;
                    skip = true;
                }
                else if(sub.equals("IX")){
                    sum+=9;
                    i++;
                    skip = true;
                }
                else if(sub.equals("XL")){
                    sum+=40;
                    i++;
                    skip = true;
                }
                else if(sub.equals("XC")){
                    sum+=90;
                    i++;
                    skip = true;
                }
                else if(sub.equals("CD")){
                    sum+=400;
                    i++;
                    skip = true;
                }
                else if(sub.equals("CM")){
                    sum+=900;
                    i++;
                    skip = true;
                }
            }
            if(!skip){
                if(curr=='I'){
                    sum+=1;
                }
                else if(curr=='V'){
                    sum+=5;
                }
                else if(curr=='X'){
                    sum+=10;
                }
                else if(curr=='L'){
                    sum+=50;
                }
                else if(curr=='C'){
                    sum+=100;
                }
                else if(curr=='D'){
                    sum+=500;
                }
                else if(curr=='M'){
                    sum+=1000;
                }
            }
        }
        return sum;
    }
}