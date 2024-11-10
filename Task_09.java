public class Task_09 {
    public static void main(String[] args) {
        int[] array = {3, 0, 1, 4};
        int n = array.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : array) {
            actualSum += num;
        }
        
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
