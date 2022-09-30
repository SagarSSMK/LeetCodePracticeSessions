package LevelOne;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] nums ={{1,10,3},{1,5,3}};

        int largestSum=0;

        for (int[] num : nums) {
            int newSum = 0;
            for (int i : num) {
                newSum += i;
            }
            if (newSum > largestSum) largestSum = newSum;
        }
        System.out.println(largestSum);
    }

}
