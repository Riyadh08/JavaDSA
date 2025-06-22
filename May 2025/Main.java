
import java.util.*;


public class Main{

    public static int longestSubstring(String ss){
        int start = 0;
        int end = 0;
        int max_lenght = 0;
        List<Character> list = new ArrayList<Character>();

        while(end < ss.length()){
            if(!list.contains(ss.charAt(end))){
                list.add(ss.charAt(end));
                end++;
                max_lenght = Math.max(max_lenght,list.size());
            }else{
                list.remove(Character.valueOf(ss.charAt(start)));
                start++;
            }
        }

        return max_lenght;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
        
    }
}