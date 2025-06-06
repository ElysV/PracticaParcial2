package Codigo;

public class C4_Case4 {

    public void encontrarNumeroMasGrande() {

        int opcion = 0;

        do{

            try {

                System.out.println("\n----------------------------------------");
                System.out.println("|                                      |");
                System.out.println("|    LOCALIZAR EL NÚMERO MÁS GRANDE    |");
                System.out.println("|                                      |");
                System.out.println("|  Selecciona Una Opción:              |");
                System.out.println("|                                      |");
                System.out.println("|  1) Iniciar                          |");
                System.out.println("|                                      |");
                System.out.println("|  2) Regresar al Menú Principal       |");
                System.out.println("|                                      |");
                System.out.println("----------------------------------------");

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
                
            } catch (Exception e) {

                M_ManejoDeExcepciones.imprimirErrores(e);

            }

        }while(opcion != 1);

        int numero = 0, maximo = 0;

        System.out.println("\nIngrese números positivos para encontrar el más grande.");
        System.out.println("(AVISO: El programa terminará cuando ingrese un número negativo.)");

        do {

            try {

                System.out.print("\nIngrese un número: ");
                numero = Integer.parseInt(X_Leer.leer.readLine());

                if (numero >= 0) {

                    if (numero > maximo) {

                        maximo = numero;

                    }

                }

            } catch (Exception e) {

                M_ManejoDeExcepciones.imprimirErrores(e);

            }

        } while (numero >= 0);

        if (maximo == 0) {

            System.out.println("No se ingresaron números positivos.");

        } else {

            System.out.println("\n-------------------------------------------");
            System.out.println("|  El número más grande ingresado es: " + maximo + "  |");
            System.out.println("-------------------------------------------");

        }
        
    }

}

