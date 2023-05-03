import java.util.HashMap;

class Solution {
    static public int romanToInt(String s) {
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();  
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        Integer sum = 0;
        
        for(int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            int value = map.get(c);
            if (i!=s.length()-1) {
                Character nextC = s.charAt(i+1);
                
                if ((c == 'I') && (nextC =='V' || nextC == 'X')) {
                    value = map.get(nextC) - map.get(c);
                    i++;           
                } else if  ((c == 'X') && (nextC =='L' || nextC == 'C')) {
                    value = map.get(nextC) - map.get(c);
                    i++;
                } else if ((c == 'C') && (nextC =='D' || nextC == 'M')) {
                    value = map.get(nextC) - map.get(c);
                    i++;    
                }
                
            }
            sum += value;


        }
        return sum;

    }

    public static void main(String args[]) {
        
        System.out.println(romanToInt("MCMXCIV"));
    }
}