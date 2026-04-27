class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1];
        
        for (int[] row : grid)
            for (int val : row)
                count[val]++;
        
        int a = -1, b = -1;
        for (int i = 1; i <= n * n; i++) {
            if (count[i] == 2) a = i;
            if (count[i] == 0) b = i;
        }
        
        return new int[]{a, b};
    }
}