import java.util.Arrays;

public class Task_07 {
     public static void splitAtKey(double[] array, double key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            double[] part1 = Arrays.copyOfRange(array, 0, index);
            double[] part2 = Arrays.copyOfRange(array, index, array.length);

            System.out.println("First part: " + Arrays.toString(part1));
            System.out.println("Second part: " + Arrays.toString(part2));
        } else {
            System.out.println("Key not found in array.");
        }
    }

    public static void main(String[] args) {
        double[] array = {5.5, 2.3, 7.8, 4.0, 1.2, 3.3, 6.1};
        splitAtKey(array, 4.0);
    }
}
