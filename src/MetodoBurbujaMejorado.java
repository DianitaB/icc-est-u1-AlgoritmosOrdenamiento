import java.util.Arrays;

public class MetodoBurbujaMejorado {
    public int[] OrdenarAscendenteM(int[] arreglo, boolean detalle) {
        int n = arreglo.length;
        int comp = 0;
        int changes = 0;
        
        boolean cambios;

        for (int i = 0; i < n - 1; i++) {
            cambios = false;
            for (int j = 0; j < n - 1 - i ; j++) {
                comp +=1; 
                if (detalle){
                    System.out.println("Comparación " + String.valueOf(comp) + ": " + String.valueOf(arreglo[j]) + " > " + String.valueOf(arreglo[j+1]));
                }
                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println("Intercambio: " + String.valueOf(arreglo[j] + " <-> " + String.valueOf(arreglo[j+1])));
                    changes +=1;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios = true;
                
                if (detalle){
                    System.out.println("Estado actual -> " + Arrays.toString(arreglo));
                } 
            }  
            if (!cambios){
                break;
            }       
        }  
    }
        System.out.println("Comparaciones: " + String.valueOf(comp));
        System.out.println("Cambios: " + String.valueOf(changes));
        return arreglo;
    }
    public int[] OrdenarDescendenteM(int[] arreglo, boolean detalle) {
        int n = arreglo.length;
        int comp = 0;
        int changes = 0;

        boolean cambios;
        
        for (int i = 0; i < n - 1; i++) {
            cambios = false;
            for (int j = 0; j < n - 1 - i ; j++) {
                comp +=1; 
                if (detalle){
                    System.out.println("Comparación " + String.valueOf(comp) + ": " + String.valueOf(arreglo[j]) + " > " + String.valueOf(arreglo[j+1]));
                }
                if (arreglo[j] < arreglo[j + 1]) {
                    System.out.println("Intercambio: " + String.valueOf(arreglo[j] + " <-> " + String.valueOf(arreglo[j+1])));
                    changes +=1;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios = true;
                    
                    if (detalle){
                        System.out.println("Estado actual -> " + Arrays.toString(arreglo));
                    }
                }
                if (!cambios){
                    break;
                }  
            }     
        }
        System.out.println("Comparaciones: " + String.valueOf(comp));
        System.out.println("Cambios: " + String.valueOf(changes));
        return arreglo;
    }
}