class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        
        Integer[] boxed = new Integer[26];
        for (int i = 0; i < 26; i++) boxed[i] = freq[i];
        Arrays.sort(boxed, Collections.reverseOrder());
        
        int total = 0;
        for (int i = 0; i < 26; i++) {
            if (boxed[i] == 0) break;
            total += boxed[i] * (i / 8 + 1);
        }
        
        return total;
    }
}