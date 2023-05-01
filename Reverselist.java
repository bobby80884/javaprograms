public class ReverseList {

    public static void main(String[] args) {
        int[] nums = {12, 64, 23, 35, 2, 67, 9, 11};

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}

