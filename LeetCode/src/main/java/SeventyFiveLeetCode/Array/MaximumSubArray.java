package SeventyFiveLeetCode.Array;

public class MaximumSubArray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int sum = nums[0];
        int max = nums[0];
        for(int j = 1 ; j<nums.length;j++){

            sum = Math.max(nums[j]+sum,nums[j] );
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
