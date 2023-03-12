class Solution {
    public int searchInsert(int[] nums, int target) {
        int li=0,hi=nums.length-1;
        int mid;
        while(li<=hi){
            mid=(li+hi)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid])
            hi=mid-1;
            else
            li=mid+1;
        }
        return li;
    }
}
