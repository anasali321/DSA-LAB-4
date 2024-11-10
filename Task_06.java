public class Task_06 {
    public static void main(String[] args) {
        double[] array = {5.5, 2.3, 7.8, 4.0, 1.2, 3.3, 6.1};
        
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        
        double mean = sum / array.length;
        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Mean of elements: " + mean);
        
    }
}
