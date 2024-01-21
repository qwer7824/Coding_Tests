class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        
        for(int i =0; i<new_id.length();i++){
            char ch = new_id.charAt(i);
            if(Character.isDigit(ch) || Character.isAlphabetic(ch) || ch == '-' || ch == '_' || ch == '.'){
                answer += ch;
            }
        }
            while(answer.indexOf("..") != -1)
            answer = answer.replace("..",".");

        if(!answer.isEmpty() && answer.charAt(0) == '.'){
            answer = answer.substring(1);
        }
        if(!answer.isEmpty() && answer.charAt(answer.length()-1) == '.'){
            answer = answer.substring(0,answer.length()-1);
        }
        if(answer.isEmpty()){
            answer = "a";
        }
        if(answer.length() > 15){
            answer = answer.substring(0,15);
            if(answer.charAt(answer.length() -1) == '.'){
                answer = answer.substring(0,answer.length() -1);
            }
        }
        while(answer.length() < 3){
            answer += answer.charAt(answer.length() -1);
        }
        return answer;
    }
}