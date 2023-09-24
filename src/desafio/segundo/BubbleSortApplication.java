package desafio.segundo;

import desafio.segundo.domain.BubbleSort;

import java.util.Arrays;

public class BubbleSortApplication {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {5, 3, 2, 4, 7, 1, 0, 6};
        bubbleSort.sort(array);
        System.out.println("Vetor ordenado: " + Arrays.toString(array));
    }
}
