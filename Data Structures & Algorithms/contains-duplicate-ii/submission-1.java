class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> dict = new HashMap<>();

        for (int i=0; i<nums.length;i++){
            if (dict.containsKey(nums[i])){
                int j = dict.get(nums[i]);
                if (Math.abs(i-j)<=k){
                    return true;
                }
            }
            
            dict.put(nums[i],i);
            
        }
        return false;
        
    }
}