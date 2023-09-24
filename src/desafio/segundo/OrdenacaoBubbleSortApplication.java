package desafio.segundo;

import desafio.segundo.domain.OrdenadorBubbleSort;

import java.util.Arrays;

public class OrdenacaoBubbleSortApplication {

    public static void main(String[] args) {
        OrdenadorBubbleSort ordenadorBubbleSort = new OrdenadorBubbleSort();
        int[] array = {5, 3, 2, 4, 7, 1, 0, 6};
        ordenadorBubbleSort.ordenar(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
