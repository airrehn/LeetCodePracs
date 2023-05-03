import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i =0; i<nums.length;i++) {
            int remains = target - nums[i] ;
            if(map.containsKey(remains)) {
                return new int[]{map.get(remains),i};
            }
            map.put(nums[i], i);
        }

        
        
        return null;
        
    }
}

public class Main {



    public static void main(String[] args) {

        int[] arr1 = Solution.twoSum(new int[] {2,7,11,15}, 9);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);


    }
}