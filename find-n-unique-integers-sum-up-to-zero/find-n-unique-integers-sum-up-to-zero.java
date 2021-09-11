class Solution {
    public int[] sumZero(int n) {
        int[] answer = new int[n];
        int temp = 1;

        if(n==1){
            answer[0]=0;
        }

        for (int i=0;i<n-1;i++){
            answer[i] = -1*temp;
            i++;
            answer[i] = temp;
            temp++;
        }


        return answer;
    }
}