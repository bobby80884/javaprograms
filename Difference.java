public class Difference {

    public static void main(String[] args) {
        int[] nums = {1, 15, -1, 23, 45, 70, 99, -13, -5};

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int diff = max - min;

        System.out.println("HIGHEST NUMBER: " + max);
        System.out.println("LOWEST NUMBER: " + min);
        System.out.println("Difference between highest and lowest is: " + diff);
    }
}

