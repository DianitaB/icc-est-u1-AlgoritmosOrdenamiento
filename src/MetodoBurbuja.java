import java.util.Arrays;

public class MetodoBurbuja {

    public int [] OrdenarAsc(int[]arreglo, boolean detalle){
        int n = arreglo.length; 
        int comp = 0;
        int changes = 0;
        
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                comp += 1;
                if (detalle){
                    System.out.println("Comparación " + String.valueOf(comp) + ": " + String.valueOf(arreglo[i]) + " > " + String.valueOf(arreglo[j]));
                    
                }
                if (arreglo[i] > arreglo[j]){
                    System.out.println("Intercambio: " + String.valueOf(arreglo[i] + " <-> " + String.valueOf(arreglo[j])));
                    changes += 1;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                    System.out.println("Estado actual -> " + Arrays.toString(arreglo));
                }
                if (detalle) { }
            }
        }
        System.out.println("Comparaciones: " + String.valueOf(comp));
        System.out.println("Cambios: " + String.valueOf(changes));
        return arreglo;
    }

    public int [] OrdernarDesc(int[]arreglo, boolean detalle){
        int comp = 0;
        int changes = 0;
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        for(int i=0; i<arreglo.length; i++){
            for(int j = i+1; j<arreglo.length; j++){
                comp += 1;
                if(detalle){
                    System.out.println("Comparación: " + String.valueOf(comp) + " " + String.valueOf(arreglo[i]) + " > " + String.valueOf(arreglo[j]));
                }
                if (arreglo[i] < arreglo[j]){
                    System.out.println("Intercambio: " + String.valueOf(arreglo[i] + " <-> " + String.valueOf(arreglo[j])));
                    changes +=1;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                    System.out.println("Estado actual -> " + Arrays.toString(arreglo));
                }
                if (detalle) { }
            }
        }
        System.out.println("Comparaciones: " + String.valueOf(comp));
        System.out.println("Cambios: " + String.valueOf(changes));
        return arreglo;
    }
}