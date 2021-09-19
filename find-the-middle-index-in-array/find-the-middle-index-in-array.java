class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum =0;
        int leftSum = 0;
        
        if(nums.length == 1)
            return 0;

        for(int i=0; i< nums.length; i++){
            sum = sum + nums[i];
        }

        for(int i=0; i< nums.length; i++){
            sum = sum - nums[i];

            if(leftSum == sum){
                return i;

            }
            leftSum = leftSum+ nums[i];

        }
     

        return -1;
    }
}