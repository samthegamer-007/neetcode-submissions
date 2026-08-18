
class Solution {
    public int search(int [] nums, int target) {
        
        return binSearch(nums, 0, nums.length-1,target);
    }
    int binSearch (int[] nums, int l, int u, int v)
    {
        int m=0;
        
        if (l<=u)
        {
            m = l + (u - l) / 2;
            if (v == nums[m])
            return m;
            else if( v> nums[m])
            return binSearch (nums, m+1,u,v);
            else if( v< nums[m])
            return binSearch(nums,  l, m-1, v);

        }
        return -1;
    }
}
