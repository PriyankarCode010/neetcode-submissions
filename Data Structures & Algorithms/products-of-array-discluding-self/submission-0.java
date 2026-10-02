class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] suffix = new int[nums.length];

        int pro = 1;
        for(int i = 0; i<nums.length; i++){
            output[i] = pro;
            pro *= nums[i];
        }

        pro = 1;
        for(int i = nums.length-1; i>=0; i--){
            suffix[i] = pro;
            pro *= nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            output[i]=output[i]*suffix[i];
        }
        return output;
    }
}  
