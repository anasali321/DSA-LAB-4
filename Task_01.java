class Task_01 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        System.out.println("Before swapping:");
        printArrays(array1, array2);

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        System.out.println("After swapping:");
        printArrays(array1, array2);
    }

    private static void printArrays(int[] array1, int[] array2) {
        System.out.println("Array1: " + java.util.Arrays.toString(array1));
        System.out.println("Array2: " + java.util.Arrays.toString(array2));
    } 
}
