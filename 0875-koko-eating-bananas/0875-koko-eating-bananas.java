class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canFinish(piles, h, mid)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        
        return left;
    }
    
    private boolean canFinish(int[] piles, int h, int k) {
        int totalHours = 0;
        
        for (int bananas : piles) {
            totalHours += (bananas + k - 1) / k; 
        }
        
        return totalHours <= h;
    }
    
    private int getMax(int[] piles) {
        int max = 0;
        for (int p : piles) {
            max = Math.max(max, p);
        }
        return max;
    }
}