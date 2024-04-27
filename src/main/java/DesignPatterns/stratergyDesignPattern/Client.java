package DesignPatterns.stratergyDesignPattern;



// SortingContext.java
class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }
}

// SortingStrategy.java
interface SortingStrategy {
    void sort(int[] array);
}

// BubbleSortStrategy.java
class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Implement Bubble Sort algorithm
        System.out.println("Sorting using Bubble Sort");
        // Actual Bubble Sort Logic here
    }
}

// MergeSortStrategy.java
class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Implement Merge Sort algorithm
        System.out.println("Sorting using Merge Sort");
        // Actual Merge Sort Logic here
    }
}

// QuickSortStrategy.java
class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Implement Quick Sort algorithm
        System.out.println("Sorting using Quick Sort");
        // Actual Quick Sort Logic here
    }
}

// Client.java
public class Client {
    public static void main(String[] args) {
        // Create SortingContext with BubbleSortStrategy
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1); // Output: Sorting using Bubble Sort

        // Change strategy to MergeSortStrategy
        sortingContext.setSortingStrategy(new MergeSortStrategy());
        int[] array2 = {8, 3, 7, 4, 2};
        sortingContext.performSort(array2); // Output: Sorting using Merge Sort

        // Change strategy to QuickSortStrategy
        sortingContext.setSortingStrategy(new QuickSortStrategy());
        int[] array3 = {6, 1, 3, 9, 5};
        sortingContext.performSort(array3); // Output: Sorting using Quick Sort
    }
}

