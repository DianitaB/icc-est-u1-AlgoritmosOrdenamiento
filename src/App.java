import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};
        MetodoBurbuja MetodoBurbujaClase = new MetodoBurbuja(); // Instanciar una clase 
        MetodoSeleccion ms = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();
        MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();

        MetodoBurbujaClase.ImprimirArreglo(arreglo);
        ms.ordernarDesSeleccion(arreglo);
        ms.ordernarAsdSeleccion(arreglo);
        ms.ds(arreglo, false);
        MetodoBurbujaClase.ImprimirArreglo(arreglo);
        
        boolean conPasos = true;
        mI.ordenarAscendente(arreglo, conPasos);
        MetodoBurbujaClase.ImprimirArreglo(arreglo);
        mBM.OrdenarAscendenteM(arreglo);
        mBM.imprimirArreglo(arreglo);
        MetodoBurbujaClase.ImprimirArreglo(arreglo);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int[] arreglok = {10,9,21,5,15,2,-1,0};
            //int [] arreglo = new int[10000];
           // for(int i = 0; i<arreglo.length; i++){
                ///arreglo[i] = (int) (Math.random()* 100000) + 1;
           // }
            System.out.println("Seleccione el método de ordenamiento");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");

            //int metodo = scanner.nextInt();

            int metodo = getPositive(scanner, "\t Ingrese una opcion: ");

            if (metodo == 5) { 
                continuar = false;
                break;
            }

            System.out.println("¿Desea ver los pasos? (true/false):");
            boolean conpasos = scanner.nextBoolean();
            System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?");
            String orden2 = scanner.next();
            boolean ascendente = orden2.equalsIgnoreCase("A");

            String orden = getValidString(scanner, new String[] {"A", "D"}, "¿Desea ordenar ascendentemente (A) o descendentemente (D)?");
            boolean ascendentee = orden.equalsIgnoreCase("A");


            int contComparaciones;
            int [] resultados;

            switch (metodo) {
                case 1:
                    System.out.println("Metodo Burbuja");
                    break;
                
                case 2:
                    System.out.println("Metodo Selección");
                    break;

                case 3:
                    System.out.println("MetodoInserccion");
                    System.out.println("Arreglo Original ->");
                    MetodoBurbujaClase.ImprimirArreglo(arreglo);
                    contComparaciones = 0;
                    mI.ordenarAscendente(arreglo, conPasos);
                    contComparaciones = mI.ordenarAscendente(arreglo,conpasos);
                    MetodoBurbujaClase.ImprimirArreglo(arreglo);
                    break;
                
                case 4:
                    System.out.println("Metodo Burbuja Mejorado");
                    System.out.println("Arreglo Original ->");
                    mBM.imprimirArreglo(arreglo);
                    resultados= mBM.OrdenarAscendenteM(arreglo);
                    System.out.println("Arreglo ordenado ->");
                    mBM.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones ->" + resultados[0]);
                    System.out.println("Cambios ->" + resultados[1]);
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
        scanner.close(); 
    }
    public static int getPositive (Scanner scanner, String message){
        int number;
        do{
            System.out.print(message + ": ");
            number = scanner.nextInt();
            if (number<=0);
            System.out.println("El número debe ser positivo. Intente nuevamente."); 


        }while(number <= 0);
        return number;
        


    }
    public static String getValidString(Scanner scanner, String [] posibles, String message){
        String input;
        boolean valido;
        do {
            System.out.println(message + ": ");
            input= scanner.next();
            valido = false;
            for (String posible : posibles){
                // ascendente , descendente .....
                if(input.equalsIgnoreCase(posible)){
                    valido = true;
                    break;

                }
            }

        } while (!valido);
        return input;

    }
}

