import java.util.Arrays;

class Task_05 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] result = mergeAndRemoveDuplicates(array1, array2);
        System.out.println("Merged Array without duplicates: " + Arrays.toString(result));
    }

    private static int[] mergeAndRemoveDuplicates(int[] array1, int[] array2) {
        // Step 1: Merge the two arrays into a new array
        int[] tempArray = new int[array1.length + array2.length];
        int k = 0;

        // Copy elements from array1
        for (int i = 0; i < array1.length; i++) {
            tempArray[k++] = array1[i];
        }

        // Copy elements from array2
        for (int i = 0; i < array2.length; i++) {
            tempArray[k++] = array2[i];
        }

        // Step 2: Remove duplicates by keeping only unique elements
        int[] uniqueArray = new int[tempArray.length];
        int uniqueCount = 0;

        for (int i = 0; i < tempArray.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (tempArray[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If it's not a duplicate, add it to the uniqueArray
            if (!isDuplicate) {
                uniqueArray[uniqueCount++] = tempArray[i];
            }
        }

        // Step 3: Create a final array with the exact size of unique elements
        int[] finalArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalArray[i] = uniqueArray[i];
        }

        return finalArray;
    }
}
