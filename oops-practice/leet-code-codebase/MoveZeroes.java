class Solution {
    public void moveZeroes(int[] nums) {
        int left=0,right=0;
        for(left=0;left<nums.length;left++){
            if(nums[left]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                right++;
            }
        }
    }
}

public class MoveZeroes {
    // main function
}
