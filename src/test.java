import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
//        HashSet<Integer> map = new HashSet<>();
//        for (int num : nums) {
//            if (!map.add(num)) {
//                System.out.println("true");
//            }
//        }
//        System.out.println("false");
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("true");
                return;
            }
        }
    }


}
