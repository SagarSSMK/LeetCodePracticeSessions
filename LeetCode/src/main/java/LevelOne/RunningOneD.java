package LevelOne;



import java.util.Arrays;

public class RunningOneD {


    public static void main(String[] args) {
        int[] nums ={1,2,34};

        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            nums[i] = nums[i] + nums[i - 1];
        }
        System.out.println(Arrays.toString(Arrays.stream(nums).toArray()));
    }

}
