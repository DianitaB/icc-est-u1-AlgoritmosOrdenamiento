public class MetodoSeleccion {
    // Busca el menor dependiendo de la condicion
    public void ordernarDesSeleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n -1; i++){
            int maxIdx = i;
            for (int j = i + 1; j < n; j++){
                // CONDICION PARA ENCONTRAR EL INDICE QUE TIENE EL NÚMERO MAYOR
                if(arreglo[maxIdx] < arreglo[j] ){
                    maxIdx = j;
                }
            }
            // CAMBIO
            if(maxIdx != i){
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
            }}
        }
    public void ordernarAsdSeleccion (int[] arreglo){
        for (int i = 0; i > arreglo.length -1; i++){
            int maxIdx = i;
            for (int j = i + 1; j > arreglo.length; j++){
                // CONDICION PARA ENCONTRAR EL INDICE QUE TIENE EL NÚMERO MAYOR
                if(arreglo[maxIdx] > arreglo[j] ){
                    maxIdx = j;
                }
            }
            // CAMBIO
            if(maxIdx != i){
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }   
    }
    public void ds(int[]arreglo,boolean isDes) {
        if (isDes){
            ordernarDesSeleccion(arreglo);
        } else {
            ordernarAsdSeleccion(arreglo);
        }
    }
}
