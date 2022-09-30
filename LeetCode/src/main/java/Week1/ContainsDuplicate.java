package Week1;

import java.sql.Array;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int a[]={33,3,4,5};
        containsDuplicate(a);
    }

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Boolean> duplicate = new HashMap<>();
        int i=0;
        boolean check=true;
        while (i< nums.length){
            if(!duplicate.isEmpty() && duplicate.get(nums[i])){
                check= false;
                break;
            }

            else {
                duplicate.put(nums[i],true);
                i++;
                check= true;
            }
        }
        return check;
    }
}
