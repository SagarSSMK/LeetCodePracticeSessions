package SeventyFiveLeetCode.Array;

import java.lang.reflect.Array;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        int length = nums.length;
//        int[] leftArray = new int[length];
//        int[] rightArray = new int[length];
//
//        int[] answerArray = new int[length];
//
//        leftArray[0] =1;
//        for(int i= 1; i<length;i++){
//            leftArray[i] = leftArray[i-1] * nums[i-1];
//        }
//
//        rightArray[length-1] =1;
//        for(int i= length-2;i>=0;i--){
//            rightArray[i] = rightArray[i+1] * nums[i+1];
//        }
//
//        for(int i=0; i<length;i++){
//            answerArray[i] = leftArray[i] * rightArray[i];
//        }

        //0(1) space
        int[] answer = new int[length];

        answer[0] =1;
        for(int i=1;i<length;i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        int right =1;
        for(int i=length-1; i>=0;i--){
            answer[i] = answer[i] * right;
            right =right * nums[i];
        }

    }
}
