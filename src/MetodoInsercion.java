import java.util.Arrays;

public class MetodoInsercion {
    public int [] ordenarAscendenteInser(int[] arreglo, boolean detalle) { 

        int tam = arreglo.length;
        int comp = 0; 
        int changes = 0;
        System.out.println("Arreglo Orginial: " + Arrays.toString(arreglo));

        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0){
                comp +=1; 

                if (detalle){
                    System.out.println("Comparación " + String.valueOf(comp) + ": " + String.valueOf(arreglo[j]) + " > " + String.valueOf(aux));
                }
                if (aux < arreglo [j]){
                    changes +=1 ;
                    arreglo[j + 1] = arreglo[j];
                    if (detalle){
                        System.out.println("Intercambio: " + String.valueOf(arreglo[j]) + " <-> " + String.valueOf(arreglo[j+1]));
                    } else{
                        System.out.println("No hay intercambio.");
                    }
                    j = j-1;
                } else {
                    break;
                }
            }
            arreglo[j + 1] = aux;
            if (detalle){
                System.out.println("Estado actual -> " + Arrays.toString(arreglo));
            }  
        }
        System.out.println("Comparaciones: " + String.valueOf(comp));
        System.out.println("Cambios: " + String.valueOf(changes)); 
        return arreglo;
    }
    public int [] ordenarDescendenteInser (int[] arreglo, boolean detalle){
        int tam = arreglo.length;
        int comp = 0; 
        int changes = 0;
        System.out.println("Arreglo Orginial: " + Arrays.toString(arreglo));

        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0){
                comp +=1; 

                if (detalle){
                    System.out.println("Comparación " + String.valueOf(comp) + ": " + String.valueOf(arreglo[j]) + " > " + String.valueOf(aux));
                }

                if (aux > arreglo [j]){
                    changes +=1 ;
                    arreglo[j + 1] = arreglo[j];
                    if (detalle){
                        System.out.println("Intercambio: " + String.valueOf(arreglo[j]) + " <-> " + String.valueOf(arreglo[j+1]));
                    } 
                    j = j-1;
                     
                } else {
                    break;
                }               
            }
            arreglo[j + 1] = aux;
            
            if (detalle){
                System.out.println("Estado actual -> " + Arrays.toString(arreglo));
            }  
        }
        System.out.println("Comparaciones: " + String.valueOf(comp));
        System.out.println("Cambios: " + String.valueOf(changes)); 
        return arreglo;
        
    }
}
