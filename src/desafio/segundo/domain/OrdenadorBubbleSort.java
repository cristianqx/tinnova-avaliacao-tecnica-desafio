package desafio.segundo.domain;

public class OrdenadorBubbleSort {
    private static final int TAMANHO_MINIMO_DO_ARRAY = 1;

    public void ordenar(int[] array) {
        if (array == null || TAMANHO_MINIMO_DO_ARRAY >= array.length) {
            return;
        }

        int tamanhoArray = array.length;

        for (int i = 0; i < tamanhoArray - 1; i++) {
            for (int j = 0; j < tamanhoArray - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    trocarElementos(array, j, j + 1);
                }
            }
        }
    }

    private void trocarElementos(int[] array, int indice, int indice2) {
        int temp = array[indice];
        array[indice] = array[indice2];
        array[indice2] = temp;
    }

}
