import java.util.Arrays;

public class MetodoSeleccion {

    public int[] ordernarDesSeleccion(int[] arreglo, boolean detalle) {

        int n = arreglo.length;
        int comp = 0;
        int changes =0;
        System.out.println("Arreglo Orginial: " + Arrays.toString(arreglo));
        for (int i = 0; i < n -1; i++){
            int maxIdx = i;
            for (int j = i + 1; j < n; j++){
                comp += 1;
                if (detalle){
                    System.out.println("Comparación " + String.valueOf(comp) + ": " + String.valueOf(arreglo[i]) + " > " + String.valueOf(arreglo[j]));
                }
                if(arreglo[maxIdx] < arreglo[j] ){
                    maxIdx = j;
                }
            }
        
            if(maxIdx != i){
                changes +=1;
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
                if (detalle){
                    System.out.println("Intercambio: " + String.valueOf(arreglo[i]) + " <-> " + String.valueOf(arreglo[maxIdx]));
                    System.out.println("Estado actual -> " + Arrays.toString(arreglo));
                }
            }
        }
        System.out.println("Comparaciones: " + String.valueOf(comp));
        System.out.println("Cambios: " + String.valueOf(changes));
        return arreglo;
     }
    public int[] ordernarAsdSeleccion (int[] arreglo, boolean detalle){
        
        int comp = 0;
        int changes =0;
        for (int i = 0; i < arreglo.length -1; i++){
            int minIdx = i;
            for (int j = i + 1; j < arreglo.length; j++){
                comp += 1;
                if (detalle){
                    System.out.println("Comparación " + String.valueOf(comp) + ": " + String.valueOf(arreglo[minIdx]) + " > " + String.valueOf(arreglo[j]));
                }
                if(arreglo[minIdx] > arreglo[j] ){
                    minIdx = j;
                }
            }

            if(minIdx != i){
                changes += 1;
                int aux = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                arreglo[i] = aux;
                if (detalle){
                    System.out.println("Intercambio: " + String.valueOf(arreglo[i]) + " <-> " + String.valueOf(arreglo[minIdx]));
                    System.out.println("Estado actual -> " + Arrays.toString(arreglo)); 
                }
            }
        }  
        System.out.println("Comparaciones: " + String.valueOf(comp));
        System.out.println("Cambios: " + String.valueOf(changes)); 
        return arreglo;
    }
}
