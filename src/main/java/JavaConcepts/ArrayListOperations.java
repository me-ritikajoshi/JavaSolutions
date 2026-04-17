package JavaConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListOperations {
    private ArrayListOperations() {
    }

    public static int largest(List<Integer> numbers) {
        int largest = numbers.get(0);
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    public static int smallest(List<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int sum(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static double average(List<Integer> numbers) {
        return (double) sum(numbers) / numbers.size();
    }

    public static int countOccurrences(List<Integer> numbers, int target) {
        int count = 0;
        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }

    public static java.util.ArrayList<Integer> removeDuplicatesPreserveOrder(List<Integer> numbers) {
        java.util.ArrayList<Integer> result = new java.util.ArrayList<>();
        for (int number : numbers) {
            if (!result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

    public static java.util.ArrayList<Integer> merge(List<Integer> first, List<Integer> second) {
        java.util.ArrayList<Integer> merged = new java.util.ArrayList<>(first);
        merged.addAll(second);
        return merged;
    }

    public static void main(String[] args) {
        java.util.ArrayList<Integer> arrList = new java.util.ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 8));
        int target = 8;
        java.util.ArrayList<Integer> arrList2 = new java.util.ArrayList<>(Arrays.asList(10, 11, 15));
        Set<Integer> set = new HashSet<>(arrList);

        System.out.println(set);
        System.out.println(merge(arrList, arrList2));
        System.out.println("Largest number is: " + largest(arrList));
        System.out.println("Smallest number is: " + smallest(arrList));
        System.out.println("Sum: " + sum(arrList));
        System.out.println("Average: " + average(arrList));
        System.out.println("Repeated Times: " + countOccurrences(arrList, target));
        System.out.println("No duplicate element: " + removeDuplicatesPreserveOrder(arrList));
    }
}
