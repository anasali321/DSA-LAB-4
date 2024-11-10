import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        int[] array = {4, 3, 7, 8, 6, 2, 1};
        
        for (int i = 0; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            } else {
                if (array[i] < array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
        
        System.out.println("Zigzag array: " + Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
