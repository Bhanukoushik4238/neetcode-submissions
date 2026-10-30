class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> dict1 = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int currvalue = target - nums[i];
            if (dict1.containsKey(currvalue)){
                return new int[] {dict1.get(currvalue),i};
            }

            dict1.put(nums[i],i);
        }

        return new int[] {};
        
    }
}
