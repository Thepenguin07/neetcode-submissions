class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n = (long) grid.length * grid.length;
        long sum1 = (n * (n + 1)) / 2, sumsq1 = (n * (n + 1) * (2 * n + 1)) / 6, sum2 = 0, sumsq2 = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                sum2 += grid[i][j];
                sumsq2 += (long) grid[i][j] * grid[i][j];
            }
        }
        long val1 = sum2 - sum1; // x - y
        long val2 = sumsq2 - sumsq1; // x^2 - y^2
        val2 = val2 / val1; // x + y
        long x = (val1 + val2) / 2;
        long y = val2 - x;
        return new int[]{(int) x, (int) y};
    }
}