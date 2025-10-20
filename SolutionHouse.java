class SolutionHouse{
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int[] shell = new int[nums.length];
        shell[0] = nums[0];
        shell[1] = Math.max(nums[0],nums[1]);

        for(int i = 2; i < nums.length; i++){
            shell[i] = Math.max(shell[i-1], nums[i] + shell[i-2]);
        }
        return shell[nums.length-1];
    }
}
