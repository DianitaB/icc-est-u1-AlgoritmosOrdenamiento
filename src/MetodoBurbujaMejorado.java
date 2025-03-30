public class MetodoBurbujaMejorado {
    public int[] OrdenarAscendenteM(int[] arreglo) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i ; j++) {
                contComparaciones++; 
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    contCambios++;
                }
            }
        }
        int [] respuestas = {contComparaciones, contCambios};
        return respuestas;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}