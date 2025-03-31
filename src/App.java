import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};

        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();
        MetodoBurbuja mB = new MetodoBurbuja();
        MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();

        System.out.println("Arreglo: " + Arrays.toString(arreglo));

        boolean continuar = true;
        String orden = "";

        while (continuar) {
            System.out.println("Seleccione el método de ordenamiento"); 
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");
            System.out.println();

            System.out.println("Ingrese una opcion: ");
            int metodo = scanner.nextInt();

            if (metodo == 5) { 
                continuar = false;
                break;
            }
            
            System.out.println("¿Desea ver los pasos? (true/false):");
            boolean detalle = scanner.nextBoolean();
            System.out.println();

            Boolean valid = false;
            while(!valid){
                System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?");
                orden = scanner.next();
                System.out.println();
                valid = getValidString(orden, new String[] {"A", "D"});
                if (!valid){
                    System.out.println("Opcion no valida.");
                    System.out.println();
                }
            }
            
            int [] resultados;
            int [] nArreglo = Arrays.copyOf(arreglo, arreglo.length);

            switch (metodo) {
                
                case 1:
                    System.out.println("Metodo Burbuja");
                    if (orden.equals("A")){
                        nArreglo = mB.OrdenarAsc(arreglo, detalle);
                    } else {
                        nArreglo = mB.OrdernarDesc(arreglo, detalle);
                    }
                    System.out.println("Arreglo: " + Arrays.toString(nArreglo));
                    break;
                
                case 2:
                    System.out.println("Metodo Selección");
                    if (orden.equals("A")){
                        nArreglo = mS.ordernarAsdSeleccion(arreglo, detalle);
                    } else {
                        nArreglo = mS.ordernarDesSeleccion(arreglo, detalle);
                    }
                    System.out.println("Arreglo: " + Arrays.toString(nArreglo));
                    break;

                case 3:
                    System.out.println("MetodoInserccion");
                    if (orden.equals("A")){
                        nArreglo = mI.ordenarAscendenteInser(arreglo,detalle);
                    } else {
                        nArreglo= mI.ordenarDescendenteInser(nArreglo, detalle);
                    }
                    System.out.println("Arreglo: " + Arrays.toString(nArreglo));
                    break;
                
                case 4:
                    System.out.println("Metodo Burbuja Mejorado");
                    if (orden.equals("A")) {
                        nArreglo = mBM.OrdenarAscendenteM(nArreglo, detalle);
                    }else{
                        nArreglo = mBM.OrdenarDescendenteM(nArreglo, detalle);
                    }
                    System.out.println("Arreglo: " + Arrays.toString(nArreglo));
                    break;
                    
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
        scanner.close(); 
    }

    public static Boolean getValidString(String input, String [] posibles){
        boolean valido = false;
        for (String posible : posibles){
            if(input.equalsIgnoreCase(posible)){
                valido = true;
                break;
            }
        }
        return valido;
    }
}

