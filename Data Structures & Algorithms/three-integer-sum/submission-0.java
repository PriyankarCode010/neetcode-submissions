class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();

        Arrays.sort(nums);

        int i = 0;

        while (i < nums.length - 2) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            int k = i + 1;
            int j = nums.length - 1;

            while (k < j) {
                int sum = nums[i] + nums[k] + nums[j];

                if (sum == 0) {
                    li.add(Arrays.asList(nums[i], nums[k], nums[j]));

                    while (k < j && nums[k] == nums[k + 1]) k++;
                    while (k < j && nums[j] == nums[j - 1]) j--;

                    k++;
                    j--;
                } 
                else if (sum < 0) {
                    k++;
                } 
                else {
                    j--;
                }
            }

            i++;
        }

        return li;
    }
}