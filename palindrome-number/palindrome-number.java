class Solution {
    public boolean isPalindrome(int x) {
        
        String s = String.valueOf(x);
        StringBuilder newS = new StringBuilder();

        if(x<0)
            return false;

        for(int i=s.length()-1; i>=0; i--){
            newS.append(s.charAt(i));
        }

        if(newS.toString().equals(s)){
            return true;
        }
       
        return false;
    }
}