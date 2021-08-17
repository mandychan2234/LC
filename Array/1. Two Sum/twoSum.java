public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int, int> m = new Dictionary<int, int>();
        
        for(int i = 0; i<nums.Length; i++){
            if(m.ContainsKey(target-nums[i])){
                return new int[]{m[target-nums[i]], i};
            }
           
            if(!m.ContainsKey(nums[i])){
                m.Add(nums[i], i);
            }
            
        }
        
        return new int[]{0,0};
    }
}