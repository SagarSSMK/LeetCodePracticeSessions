package SeventyFiveLeetCode.Array;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        int target =0;

        int value = -1;

        int start =0;
        while (start<nums.length){
            if(nums[start]==target){
                value = start;
                break;
            }
            start++;
        }
        System.out.println(value);
    }
}
