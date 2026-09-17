class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length, result = 0;
        int minDif = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1; // left pointer
            int r = n - 1;//right pointer
            while (l < r) {
                int sum = (nums[i] + nums[l] + nums[r]);
                if (sum == target)
                    return target;
                int diff = Math.abs(sum - target);
                if (diff < minDif) {
                    result = sum;
                    minDif = diff;
                }
                if (sum < target)
                    l++;
                else
                    r--;
            }
        }
        return result;
    }
}