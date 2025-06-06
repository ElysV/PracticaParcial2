package Codigo;
import java.io.*;

public class M_ManejoDeExcepciones {

    /**
     * Imprime un mensaje de error personalizado según el tipo de excepción y muestra la localización del error.
     * @param e Excepción capturada.
     */

    public static void imprimirErrores(Exception excepciones){

        String mensaje;

        if (excepciones instanceof IOException) {

            mensaje = "Error de entrada/salida: ";

        } else if (excepciones instanceof ClassNotFoundException) {

            mensaje = "Error de clase no encontrada: ";

        } else if (excepciones instanceof ArithmeticException) {

            mensaje = "Error aritmético: ";

        } else if (excepciones instanceof IllegalArgumentException) {

            mensaje = "Error de argumento ilegal: ";

        } else if (excepciones instanceof NullPointerException) {

            mensaje = "Error de puntero nulo: ";

        } else if (excepciones instanceof ArrayIndexOutOfBoundsException) {

            mensaje = "Error de índice fuera de rango en un array: ";

        } else if (excepciones instanceof NumberFormatException) {

            mensaje = "Error de conversión texto a número: ";

        } else {

            mensaje = "Error desconocido: ";

        }
        
        System.out.println("\n" + Z_Colores.rojo + mensaje + (excepciones.getMessage() != null ? excepciones.getMessage() : "") + Z_Colores.reset);

        try {

            while (true) {

                System.out.println("\n¿Desea ver más información sobre en donde ocurrió el error? (Si/No): " + Z_Colores.reset);

                System.out.print("Respuesta: ");
                String respuesta = X_Leer.leer.readLine();

                if (respuesta.equalsIgnoreCase("Si")) {

                    StackTraceElement[] localizarError = excepciones.getStackTrace();

                    for (StackTraceElement elemento : localizarError) {

                        if (elemento.getClassName().startsWith("Lab6")) { // O el nombre de tu paquete

                            System.out.println("\nClase: " + Z_Colores.cyan + elemento.getClassName() + Z_Colores.reset);
                            System.out.println("Archivo: " + Z_Colores.cyan + elemento.getFileName() + Z_Colores.reset);
                            System.out.println("Método: " + Z_Colores.cyan + elemento.getMethodName() + Z_Colores.reset);
                            System.out.println("Línea: " + Z_Colores.cyan + elemento.getLineNumber() + Z_Colores.reset);

                            break;

                        }

                    }

                    break;

                } else if (respuesta.equalsIgnoreCase("No")) {

                    break;

                } else {

                    System.out.println("\nOpción incorrecta. Por favor, escriba 'Si' o 'No'.");

                }

            } 

            int opcion = 0;

            do{

                System.out.println("\n---------------------------------------------");
                System.out.println("|                                           |");
                System.out.println("|    ¿DESEAS CONTINUAR EN DONDE ESTABAS?    |");
                System.out.println("|                                           |");
                System.out.println("|  Selecciona Una Opción:                   |");
                System.out.println("|                                           |");
                System.out.println("|  1) Continuar                             |");
                System.out.println("|                                           |");
                System.out.println("|  2) Regresar al Menú Principal            |");
                System.out.println("|                                           |");
                System.out.println("---------------------------------------------");

                System.out.print("\nElija una opción: ");

                opcion = Integer.parseInt(X_Leer.leer.readLine());

                switch (opcion) {

                    case 1:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");
                        
                    break;
        
                    case 2:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");
                        
                        System.out.println("\nRegresando al menú principal...");
                        
                        B_MenuPrincipal menu = new B_MenuPrincipal();
                        menu.mostrarMenuPrincipal();
                        
                    break;
                
                    default:
        
                        System.out.println("\nOpción no válida. Por favor, elija una opción del menú entre 1-2.");
        
                    break;
        
                }

            }while (opcion != 1);

            
        } catch (Exception e) {

            imprimirErrores(e);
            
        }

    }

}


