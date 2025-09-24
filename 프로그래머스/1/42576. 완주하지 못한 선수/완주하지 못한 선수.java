import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        String answer = "";
        for(String now : participant){
            map.put(now , map.getOrDefault(now,0)+1);
        }
        for(String p : completion){
            map.put(p, map.get(p)-1);
        }
        for(String n : map.keySet()){
            if(map.get(n)==1) answer = n;
        }
        return answer;
    }
    
}