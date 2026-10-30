class Solution {
    public boolean hasDuplicate(int[] nums) {
        // implementing set data structure
        Set<Integer> set1 = new HashSet<>();
        // here set is interface and hashset is an class that implements set interface
        // adding elements to set 
        // using for-each loop
        for (int i : nums){
            set1.add(i);
        }

        return nums.length != set1.size();

    }
}