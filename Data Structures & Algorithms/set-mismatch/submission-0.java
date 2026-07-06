class Solution {
    public int[] findErrorNums(int[] nums) {
       long n = nums.length;
    long expectedSum = n * (n + 1) / 2;
    long expectedSqSum = n * (n + 1) * (2 * n + 1) / 6;
    long actualSum = 0;
    long actualSqSum = 0;
    for (int num : nums) {
        actualSum += num;
        actualSqSum += (long) num * num;
    }
    // diffSum = x - y (where x is duplicate, y is missing)
    long diffSum = actualSum - expectedSum;
    // diffSqSum = x^2 - y^2 = (x - y)(x + y)
    long diffSqSum = actualSqSum - expectedSqSum;
    // sumXY = x + y
    long sumXY = diffSqSum / diffSum;
    int x = (int) ((diffSum + sumXY) / 2);
    int y = (int) ((sumXY - diffSum) / 2);
    return new int[]{x, y};
    }
}