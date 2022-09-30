package SeventyFiveLeetCode.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(contains(nums));
    }

    public static Boolean contains(int[] nums){
//        HashMap<Integer,Boolean> map = new HashMap<>();
//        boolean check =false;
//        int start=0;
//        while(start<nums.length){
//            if(map.containsKey(nums[start])){
//                check = true;
//                break;
//            }
//            else {
//                map.put(nums[start],true);
//            }
//            start++;
//        }
//        return check;

        Set<Integer> uniqueNums= new HashSet();

        for(int num: nums){
            if(!uniqueNums.add(num)){
                return true;
            }
        }

        return false;
    }
}
