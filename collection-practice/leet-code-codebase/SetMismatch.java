import java.util.Arrays;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
         int [] ans = new int[2];
         for(int num : nums){
            map.put(num, map.getOrDefault(num , 0)+1);
         }
         for(int i = 1;i<=nums.length;i++){
            if(map.getOrDefault(i , 0) == 0){
                ans[1] = i;
            }
            else if(map.getOrDefault(i, 0) == 2){
                ans[0] = i;
            }
         }
         return ans;
    }


}
