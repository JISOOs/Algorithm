class Solution {
    public int searchInsert(int[] nums, int target) {
        
         int count =0;

        for(int i: nums){
            if(i != target){
                count++;
            }else{
                return count;
            }
        }

        if(count == nums.length){
            count =0;
            for(int i=0; i< nums.length; i++) {
                if(target>nums[i]){
                      count++;
                }
            }
            return count;
        }
        return count;
    }
}