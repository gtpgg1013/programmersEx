package programmers;

import java.util.*;

class hash_1_my {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        //String[] completion2  = new String[completion.length];
        //boolean flag = false;
        int ans = participant.length-1;
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                ans = i;
                break;
            }
        }
       
        String answer = participant[ans];
        return answer;
    }
}