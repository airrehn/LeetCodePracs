import java.util.*;
class Solution {
    public int reverse(int x) {
        
        if (x == Integer.MIN_VALUE) {
            return 0;
        }

        int num = x;
        if(x<0) {
            num = -x;
        }
        String s = String.valueOf(num);



        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            stack.push(c);
        }

        String s2 = "";
        while(!stack.empty()) {
            s2 = s2 + stack.pop();
        }


        long reversedLong = Long.parseLong(s2);

        if(reversedLong>Integer.MAX_VALUE || reversedLong<Integer.MIN_VALUE) {

            return 0;
        } else {

            int reversed = Integer.parseInt(s2);
            if (x<0) {
                reversed = -reversed;
            }
            return reversed;

        }
    }
}