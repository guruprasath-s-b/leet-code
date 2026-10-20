class Solution {
    public int removeElement(int[] nums, int val) {
        int nextPosition = 0;

        for (int num : nums) {
            if (num != val) {
                nums[nextPosition++] = num;
            }
        }

        return nextPosition;
    }
}
