public class SearchNumber {

    public static void main(String[] args) {
        int[] nums = {34, 67, 81, 97, 45, 54, 90, 83};
        int searchNum = 54;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == searchNum) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Given number is present in the list");
        } else {
            System.out.println("Given number is not present in the list");
        }
    }
}