package ordenadordeiniciativa;

public class Quick {

    static void quickSort(int[] v, int esq, int dir) {
        if (esq < dir) {
            int j = separar(v, esq, dir);
            quickSort(v, esq, j - 1);
            quickSort(v, j + 1, dir);
        }
    }

    private static int separar(int[] v, int esq, int dir) {
        int i = esq, j = dir;
        while (i < j) {
            while (i < dir && v[i] <= v[esq]) {
                i++;
            }
            while (j > esq && v[j] >= v[esq]) {
                j--;
            }
            if (i < j) {
                trocar(v, i, j);
                i++;
                j--;
            }
        }
        trocar(v, esq, j);
        return j;
    }

    private static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
