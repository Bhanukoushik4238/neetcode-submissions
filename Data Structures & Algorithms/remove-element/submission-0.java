class Solution {
    public int removeElement(int[] nums, int val) {

        int k=0; // k is at index 0
        int count =0;
        for (int i=0; i<nums.length;i++){
            if(nums[i]!=val){
                int temp = nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                count+=1; // after swaping increase the count
                k+=1;
            }
        }

        return count;
        
    }
}