package Codigo;

public class B_MenuPrincipal{

    public void mostrarMenuPrincipal(){

        int opcion = 0;

        do{

            try {

                System.out.println("\n------------------------------------------");
                System.out.println("|                                        |");
                System.out.println("|  BIENVENIDO AL PROGRAMA DISEÑADO PARA  |");
                System.out.println("|           EL LABORATORIO N°6           |");
                System.out.println("|                                        |");
                System.out.println("|  Seleccione Una Opción:                |");
                System.out.println("|                                        |");
                System.out.println("|  1) Calcular El Factorial De Un        |");
                System.out.println("|     Número                             |");
                System.out.println("|                                        |");
                System.out.println("|  2) Calcular La Suma De Los Dígitos    |");
                System.out.println("|     De Un Número                       |");
                System.out.println("|                                        |");
                System.out.println("|  3) Calcular Cantidad De Números       |");
                System.out.println("|     Primos Entre Dos Números           |");
                System.out.println("|                                        |");
                System.out.println("|  4) Localizar El Número Más Grande     |");
                System.out.println("|     De Una Serie De Números            |");
                System.out.println("|                                        |");
                System.out.println("|  5) Opiniones De Estudiantes           |");
                System.out.println("|                                        |");
                System.out.println("|  6) Finalizar Programa                 |");
                System.out.println("|                                        |");
                System.out.println("------------------------------------------");

                System.out.print("\nElija una opción: ");

                opcion = Integer.parseInt(X_Leer.leer.readLine());

                switch (opcion) {

                    case 1:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");

                        C1_Case1 problema1 = new C1_Case1();
                        problema1.menuCalcularFactorial();
                        
                    break;

                    case 2:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");

                        C2_Case2 problema2 = new C2_Case2();
                        problema2.menuCalcularSumaDeDigitos();
                        
                    break;

                    case 3:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");

                        C3_Case3 problema3 = new C3_Case3();
                        problema3.menuCalcularPrimos();
                        
                    break;

                    case 4:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");

                        C4_Case4 problema4 = new C4_Case4();
                        problema4.encontrarNumeroMasGrande();
                        
                    break;



                    case 5:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");

                        O_Opiniones opiniones = new O_Opiniones();
                        opiniones.mostrarOpiniones();
                        
                    break;
        
                    case 6:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");

                        System.out.println("\n--------------------------------");
                        System.out.println("|    CREADORES DEL PROGRAMA    |");
                        System.out.println("--------------------------------");
                        System.out.println("|  » Elys  Vergara 8-975-1496  |");
                        System.out.println("|  » Liz   Herrera 8-993-1117  |");
                        System.out.println("--------------------------------");

                        System.out.println("\n" + Z_Colores.verde + "Fin del programa." + Z_Colores.reset + "\n");
        
                        X_Leer.leer.close(); 

                        System.exit(0);
                        
                    break;
                
                    default:
        
                        System.out.println("\nOpción no válida. Por favor, elija una opción válida entre 1-6.");
        
                    break;
        
                }
                
            } catch (Exception e) {

                M_ManejoDeExcepciones.imprimirErrores(e);

            }

        }while (opcion != 6);

    }
    
}