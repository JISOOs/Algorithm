class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] answer = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if(i!=j && nums[i]+nums[j]==target){
                    answer= new int[]{i, j};
                }
            }
        }

        return answer;
    }
}