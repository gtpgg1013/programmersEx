package programmers;

import java.util.*;

class value {
    int totalplayed;
    ArrayList<song> list;
    String name;
    public value (int totalplayed, ArrayList<song> list, String name){
        this.totalplayed = totalplayed;
        this.list = list;
        this.name = name;
    }
}

class song {
    int num;
    int played;
    public song(int num, int played){
        this.num = num;
        this.played = played;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, value> map = new HashMap<>();
        for(int i=0;i<genres.length;i++){
            if(!map.containsKey(genres[i])){ // 처음 만들었을 때
                map.put(genres[i],new value(plays[i], new ArrayList<song>(), genres[i]));
                map.get(genres[i]).list.add(new song(i,plays[i]));
            } else { // 있는걸 만질때
                map.get(genres[i]).totalplayed += plays[i];
                // System.out.println(map.get(genres[i]).totalplayed);
                map.get(genres[i]).list.add(new song(i,plays[i]));
                // System.out.println(map.get(genres[i]).list.get(0).num);
            }
        }
        value[] orderlist = new value[map.size()];
        int od = 0;
        for(String key : map.keySet()){
            orderlist[od] = map.get(key);
            od++;
        }
        
        Comparator<value> orderComparator = new Comparator<value>(){
            public int compare(value v1, value v2){
                return v2.totalplayed - v1.totalplayed;
            }
        };
        
        Arrays.sort(orderlist, orderComparator);
        
        Comparator<song> songComparator = new Comparator<song>(){
        	@Override
            public int compare(song s1, song s2){
                if(s1.played==s2.played){
                    return s1.num-s2.num;
                }
                return s2.played - s1.played;
            }
        };
        
        ArrayList<Integer> anslist = new ArrayList<>();
        for(int i=0;i<orderlist.length;i++){
            String key = orderlist[i].name;
            ArrayList<song> list = map.get(key).list;
            Collections.sort(list, songComparator);
            if(list.size()==1){
                anslist.add(list.get(0).num);
            } else {
                anslist.add(list.get(0).num);
                anslist.add(list.get(1).num);
            }
        }
        answer = new int[anslist.size()];
        for(int i=0;i<anslist.size();i++){
            answer[i] = anslist.get(i);
        }
        
        return answer;
    }
}

public class hash_4 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] ans = sol.solution(genres, plays);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
	
}
