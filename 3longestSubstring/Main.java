import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        int maxCount = 0;
        int start = 0;
        for (int i = 1; i<=s.length();i++) { //1-indexed
            char c = s.charAt(i-1);
            if (!map.containsKey(c)) {
                map.put(c, i);
                count ++;
            } else {
                int leftIdx = map.get(c);
                if (leftIdx > start) { // the repeated char is in the current window
                    start = leftIdx;
                    count = i - leftIdx; 
                } else { // the repeated char is NOT in the window -> add to count as per normal
                    count ++;
                }
                map.replace(c,i);
            }
            if(count>maxCount) { 
                maxCount = count;
            }

        }
        return maxCount;
        
    }
}