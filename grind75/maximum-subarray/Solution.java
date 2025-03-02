
class Solution {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int currentSum = 0, max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += nums[i];
            if (currentSum > max) {
                max = currentSum;
            }
        }
        return max;
    }
}
