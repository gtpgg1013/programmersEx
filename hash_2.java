package programmers;

import java.util.*;

// 이 방법 말고도 startsWith 함수(boolean)를 사용하면 더 쉽게 풀 수 있음

class hash_2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        boolean flag = true;
        for(int i=0;i<phone_book.length;i++){
            for(int j=i+1;j<phone_book.length-i;j++){
                if(phone_book[i].length()>phone_book[j].length()){
                    if((phone_book[i].substring(0,phone_book[j].length())).equals(phone_book[j])){
                        answer = false;
                        flag = false;
                        break;
                    }
                }
                else {
                    if((phone_book[j].substring(0,phone_book[i].length())).equals(phone_book[i])){
                        answer = false;
                        flag = false;
                        break;
                    }
                }
            }
            if(flag==false) break;
        }
        return answer;
    }
}
