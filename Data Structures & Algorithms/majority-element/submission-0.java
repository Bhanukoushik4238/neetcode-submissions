class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> dict = new HashMap<>();
        for (int num : nums){
            dict.put(num,dict.getOrDefault(num,0)+1);
        }
        int n = dict.size();
        for (Map.Entry<Integer,Integer> num : dict.entrySet()){
            if (num.getValue()>nums.length/2){
                return num.getKey();
            }
        }

        return -1;
        
    }
}