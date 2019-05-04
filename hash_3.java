package programmers;

import java.util.*;

class hash_3 {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        // clothes[i][1]이 종류, [i][0]이 세부내용
        // System.out.println(clothes.length);
        for(int i=0;i<clothes.length;i++){
            map.put(clothes[i][1],(map.getOrDefault(clothes[i][1],1) + 1));
        }
        answer = 1;
        for(String key : map.keySet()){
            answer *= map.get(key);
        }
        // System.out.println(answer-1);
        return answer-1;
    }
}
