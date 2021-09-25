import java.util.*;

class Solution {
    public boolean isValid(String input) {
         Stack<Character> chars = new Stack<Character>();

        for(char c: input.toCharArray()){
           if(chars.isEmpty()){
               chars.push(c);
           }else if(c ==')' && chars.peek() == '('){
               chars.pop();
           }else if(c =='}' && chars.peek() == '{') {
               chars.pop();
           }else if(c ==']' && chars.peek() == '[') {
               chars.pop();
           }else if(c ==']' || c =='}' ||c ==')' ){
               return false;
           }else{
               chars.push(c);
           }
        }

        if(chars.isEmpty()){
            return true;
        }

        return false;

    }
}