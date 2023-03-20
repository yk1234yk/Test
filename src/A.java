import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10);
        }
        int value = (int) (Math.random() * 10);
        System.out.println(Arrays.toString(ints));
        System.out.println(value);
        boolean del = del(ints, value);
        System.out.println(del);
    }

    static boolean del(int[] arr, int value) {
        if (arr.length == 0)
            return false;
        value = arr[0];
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value > arr[i]) {
                value = arr[i];
                pos = i;
            }
        }
        arr[pos] = arr[arr.length - 1];
        return true;
    }
}
