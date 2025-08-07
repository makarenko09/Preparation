import java.util.Arrays;

public class TaskArray {

    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr2));
        int length = arr2.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = arr2[length - 1 - i];
        }
        System.out.println(Arrays.toString(result));

    }
}
