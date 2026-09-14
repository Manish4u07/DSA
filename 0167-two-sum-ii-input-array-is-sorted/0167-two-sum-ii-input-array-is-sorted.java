class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st = 0, end = numbers.length - 1;
        while (st <= end) {
            int sum = 0;
            sum = numbers[st] + numbers[end];

            if (sum == target) {
                break;
            } else if (sum < target) {
                st++;
            } else {
                end--;
            }
        }
        return new int[] { st + 1, end + 1 };
    }
}