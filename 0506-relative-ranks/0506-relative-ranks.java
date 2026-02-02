import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        
        
        int[] sorted = score.clone();
        
        
        Arrays.sort(sorted);
        
        
        Map<Integer, String> rankMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int s = sorted[n - 1 - i];  
            
            if (i == 0) {
                rankMap.put(s, "Gold Medal");
            } else if (i == 1) {
                rankMap.put(s, "Silver Medal");
            } else if (i == 2) {
                rankMap.put(s, "Bronze Medal");
            } else {
                rankMap.put(s, String.valueOf(i + 1));
            }
        }
        
        
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }
        
        return result;
    }
}
