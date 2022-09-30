package SeventyFiveLeetCode.Array;

public class MinimumRotatedSortedArray {
    public static void main(String[] args) {

        int[] nums = {3,4,5,1,2};
        
        int start=0;
        int len = nums.length;
        
        int min = nums[0];
        while (start+1<len){
            
            if(nums[start]>nums[start+1]){
                min = nums[start+1];
                break;
            }

            start++;
        }
        
        System.out.println(min);
    }
}
