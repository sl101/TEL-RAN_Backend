import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(5);
        int[] arr = new int[15];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = random.nextInt(0, 9);
            arr[i] = number;
            if (number % 2 == 0) ++count;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(String.format("%s %s", "number of even elements:", count));
    }
}
