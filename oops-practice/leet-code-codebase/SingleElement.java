class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int element = nums[nums.length-1];
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                element=nums[i];
                break;
            }
        }
        return element;
        
    }
}
public class SingleElement {
    //main function 
    
}
