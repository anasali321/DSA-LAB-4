import java.util.ArrayList;
import java.util.List;

public class Task_08 {
     public static void main(String[] args) {
        int[] array = {2, 3, 6, 7};
        int target = 7;
        
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(array, target, 0, new ArrayList<>(), result);
        
        System.out.println("Unique combinations that sum to target: " + result);
    }

    private static void findCombinations(int[] array, int target, int start, List<Integer> combination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        
        for (int i = start; i < array.length; i++) {
            if (array[i] <= target) {
                combination.add(array[i]);
                findCombinations(array, target - array[i], i + 1, combination, result); // move to the next index
                combination.remove(combination.size() - 1);
            }
        }
    }
}
