Assignment 3: Sorting and Searching Algorithm Analysis System
A. Project Overview
This project is a performance analysis system developed for the Algorithms and Data Structures course. The primary goal is to practically measure and compare how different algorithms behave as the data size ($n$) increases, validating the theoretical Big-O notation complexities.
Selected Algorithms:
•	Basic Sort: Bubble Sort
•	Advanced Sort: Merge Sort
•	Searching: Binary Search
________________________________________
B. Algorithm Descriptions
1. Bubble Sort (Category A)
•	Logic: A simple comparison-based algorithm where each pair of adjacent elements is compared and swapped if they are in the wrong order. This process repeats until the largest elements "bubble up" to the end.
•	Time Complexity: * Worst Case: $O(n^2)$
o	Best Case (Optimized): $O(n)$
•	Space Complexity: $O(1)$ (In-place).
2. Merge Sort (Category B)
•	Logic: A "Divide and Conquer" algorithm. It recursively divides the array into two halves, sorts them independently, and then merges the sorted halves back together.
•	Time Complexity: * All Cases: $O(n \log n)$
•	Space Complexity: $O(n)$ (Requires extra memory for merging).
3. Binary Search (Category C)
•	Logic: A search algorithm that finds the position of a target value within a sorted array. It works by repeatedly dividing the search interval in half.
•	Time Complexity: $O(\log n)$
•	Requirement: Requires the data to be pre-sorted.
________________________________________
C. Experimental Results
The following measurements were taken using System.nanoTime() on a Windows machine.
Execution Time Table (nanoseconds)

