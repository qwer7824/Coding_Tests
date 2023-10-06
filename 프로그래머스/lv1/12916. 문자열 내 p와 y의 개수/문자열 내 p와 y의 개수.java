class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;
        
        String sLowercase = s.toLowerCase();
        
        for(int i=0; i < sLowercase.length(); i++){
            char c = sLowercase.charAt(i);
            
            if(c == 'p'){
                pCount ++;
            }else if(c == 'y'){
                yCount ++;
            }
        }
        if(pCount == yCount){
            return answer = true;
        }
        return answer = false;
    }
}