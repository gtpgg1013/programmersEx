package programmers;

import java.util.*;

public class hash_1 { // map을 사용하면 key는 중복되지 않음! put쓰면 새롭게 갱신

	public static void main(String[] args) {
		String[] participant = {};
		String[] completion = {};
		String answer;
		HashMap<String, Integer> map = new HashMap<>();
		for(String name : participant) {
			map.put(name, map.getOrDefault(name, 0)+1);
		}
		for(String name : completion) {
			map.put(name, map.get(name)-1);
		}
		for(String key : map.keySet()) {
			if(map.get(key)!=0) {
				answer = key;
			}
		}
	}

}
