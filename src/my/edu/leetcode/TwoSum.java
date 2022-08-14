package my.edu.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
//        int [] nums = {2,7,11,15};
//        int target = 9;
        int [] nums = {3,3};
        int target = 6;


        int [] response = twoSum.twoSum(nums, target);
        for(int index : response)
            System.out.println("index = " + index);

    }

    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        boolean foundIt = false;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(!foundIt && i != j && (nums[i] + nums[j]) == target ){
                    result[0] = i;
                    result[1] = j;
                    foundIt = true;
                }
            }
        }
        return result;

    }

}
