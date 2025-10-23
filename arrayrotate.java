class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==0)
        return;

        k=k%n;
        int[] temp = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            int newindex=(i+k)%n;
            temp[newindex]= nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, n);
    }
}
