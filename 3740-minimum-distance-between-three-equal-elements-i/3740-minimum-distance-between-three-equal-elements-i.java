import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: Store indices for each number
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int minDist = Integer.MAX_VALUE;

        // Step 2: Check each value
        for (List<Integer> indices : map.values()) {
            if (indices.size() >= 3) {
                // Sliding window of size 3
                for (int i = 0; i <= indices.size() - 3; i++) {
                    int dist = 2 * (indices.get(i + 2) - indices.get(i));
                    minDist = Math.min(minDist, dist);
                }
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}