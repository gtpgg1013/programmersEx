package programmers;

import java.util.*;

// map.containsKey(key) boolean �Լ��� ����ؼ� �����ϴ��� �ʴ��� Ȯ���� �� �ִ� (getOrDefault�Լ� ��� if - else�� �б�)

class hash_3 {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        // clothes[i][1]�� ����, [i][0]�� ���γ���
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
