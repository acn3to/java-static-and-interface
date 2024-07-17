import sort.BubbleSort;
import sort.QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println("Array ordenado com Bubble Sort:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        System.out.println("Array ordenado com Quick Sort:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}