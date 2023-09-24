package desafio.segundo.domain;

public class BubbleSort {
    private static final int QUANTIDADE_MINIMA_LENGTH = 1;

    public void sort(int[] array) {
        if (array == null || QUANTIDADE_MINIMA_LENGTH >= array.length) {
            return;
        }

        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    trocar(array, j, j + 1);
                }
            }
        }
    }

    private void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
