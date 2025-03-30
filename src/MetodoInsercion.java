public class MetodoInsercion {
    public int ordenarAscendente(int[] arreglo, boolean conpasos) { 
        int tam = arreglo.length;
        int contComparaciones = 0; 

        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            if(conpasos){
                System.out.println("i = " + i + ", j = " + j);
            } 

            while (j >= 0 && aux < arreglo[j]) {
                contComparaciones++; 
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = aux;
        }
        
        return contComparaciones;
    }

    public void imprimirArreglo(int[] arreglo) { 
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println(); 
    }
}
// ascendente y descendente