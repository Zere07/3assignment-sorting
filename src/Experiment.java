import java.util.Arrays;

public class Experiment {

    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();
        searcher.search(arr, target);
        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("\nArray size: " + size);

            int[] randomArr = sorter.generateRandomArray(size);
            int[] sortedArr = Arrays.copyOf(randomArr, randomArr.length);
            sorter.advancedSort(sortedArr);

            // Sorting tests
            System.out.println("Random array:");
            System.out.println("Bubble Sort time: " + measureSortTime(randomArr, "basic"));
            System.out.println("Merge Sort time: " + measureSortTime(randomArr, "advanced"));

            System.out.println("Sorted array:");
            System.out.println("Bubble Sort time: " + measureSortTime(sortedArr, "basic"));
            System.out.println("Merge Sort time: " + measureSortTime(sortedArr, "advanced"));

            // Searching test
            int target = sortedArr[size / 2];
            System.out.println("Binary Search time: " + measureSearchTime(sortedArr, target));
        }
    }
}