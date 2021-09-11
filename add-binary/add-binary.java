class Solution {
    public String addBinary(String a, String b) {
    
        StringBuilder sb = new StringBuilder();
    
        int i = a.length()-1;
        int j = b.length()-1;
    
        //2진수 = 몫+나머지
        int remain = 0;
        int sum = 0;
    
        while(i >= 0 || j >= 0){
            sum = remain;
        
            if(i >= 0){
                sum += a.charAt(i)  - '0';
                i--;
            }
        
            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
       
            sb.append(sum % 2);
            remain = sum / 2;            
        }
    
    if(remain > 0){
         sb.append(remain);
    }
       
    
     return sb.reverse().toString();
    }
}
