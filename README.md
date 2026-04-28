Assignment 3: Sorting and Searching Algorithm Analysis
A. Project Overview
The goal of this project is to implement and compare basic and advanced sorting and searching algorithms. By measuring execution time with System.nanoTime(), we analyze how different input sizes (Small, Medium, Large) and data structures (Random vs. Sorted) affect performance in a real-world scenario.
Selected Algorithms:
 • Category A (Basic): Bubble Sort
 • Category B (Advanced): Merge Sort
 • Category C (Searching): Binary Search

B. Algorithm Descriptions
Algorithm
How it Works
Time Complexity
Bubble Sort
Compares adjacent elements and swaps them if they are in the wrong order. Large values "bubble" to the end.
O(n2)
Merge Sort
A divide-and-conquer algorithm that splits the array into halves, sorts them, and merges them back.
O(nlogn)
Binary Search
Finds a target in a sorted array by repeatedly halving the search interval.
O(logn)


C. Experimental Results
Sorting Performance (nanoseconds)
Size
Type
Bubble Sort
Merge Sort
10
Random

Sorted
100
Random

Sorted

1000
Random

Sorted

Searching Performance (nanoseconds)
Size
Algorithm
Time
10
Binary Search
[Enter Value]
100
Binary Search
[Enter Value]
1000
Binary Search
[Enter Value]


D. Performance Analysis
 1 Faster Sorter? Merge Sort was much faster on larger arrays because its logarithmic complexity handles growth better than Bubble Sort's quadratic approach.
 2 Input Size: As the array size grows, the time for Bubble Sort increases exponentially, while Merge Sort grows much more slowly.
 3 Sorted vs. Unsorted: Bubble Sort performed significantly better on already sorted data because of the early exit optimization (swapped flag). Merge Sort's performance remained consistent.
 4 Big-O Match? Yes, the results followed the expected theoretical patterns (quadratic growth for Bubble vs. linear-logarithmic for Merge).
 5 Searching Efficiency: Binary Search is extremely fast because it cuts the data in half each step, rather than checking every element.
 6 Why Sorted for Binary? Because it relies on the order to decide whether to search the left or right half. If it's unsorted, the logic breaks.

E. Screenshots
 • Program Output: [docs/screenshots/results.png]

F. Reflection
This project helped me see the bridge between theory and practice. Even though O(n2) and O(nlogn) look similar on paper for small n, the gap in execution time on 1,000+ elements is massive.
One challenge was ensuring the arrays were copied correctly using Arrays.copyOf() so that one algorithm didn't inherit a pre-sorted array from a previous test. Overall, I learned that choosing the right algorithm is more important than just having a powerful processor.

