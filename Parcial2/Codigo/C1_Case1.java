package Codigo;
import java.util.ArrayList;

public class C1_Case1 {

    ArrayList<C1_InicializarCase1> numeros = new ArrayList<C1_InicializarCase1>();

    public void menuCalcularFactorial(){

        int opcion = 0;

        do{

            try {

                System.out.println("\n---------------------------------------------");
                System.out.println("|                                           |");
                System.out.println("|   CALCULAR EL FACTORIAL DE UN NÚMERO      |");
                System.out.println("|                                           |");
                System.out.println("|  Selecciona Una Opción:                   |");
                System.out.println("|                                           |");
                System.out.println("|  1) Iniciar                               |");
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
                
            } catch (Exception e) {

                M_ManejoDeExcepciones.imprimirErrores(e);

            }

        }while (opcion != 1);

        int tamaño = 0;

        do{

            try {

                System.out.println("\n¿Qué cantidad de veces desea  ");
                System.out.print("Cantidad de números: ");
                tamaño = Integer.parseInt(X_Leer.leer.readLine());

                if(tamaño > 0){

                    break;

                }else {

                    System.out.println("\nLa cantidad debe ser mayor a 0.");

                }

                
            } catch (Exception e) {

                M_ManejoDeExcepciones.imprimirErrores(e);

            }

        }while (true);
    
        for(int i = 0; i < tamaño; i++){

            boolean validarEntrada = false;

            do{

                try {

                    System.out.println("\nIngrese su factorial N°" + (i + 1));

                    System.out.print("\nNúmero: ");
                    int numeroFactorial = Integer.parseInt(X_Leer.leer.readLine());
            
                    if (numeroFactorial < 0){

                        System.out.println("\nEl número debe ser mayor o igual a 0.");

                        validarEntrada = false;

                    }else{

                        numeros.add(new C1_InicializarCase1(numeroFactorial));

                        validarEntrada = true;

                    }
                    
                } catch (Exception e) {
                    
                    M_ManejoDeExcepciones.imprimirErrores(e);

                }

            }while(!validarEntrada);

        }

        for(int i = 0; i < numeros.size(); i++){

            System.out.println("\n-------------------------------------");
            System.out.println("|    Resultado del Factorial N°" + (i+1) + "    |");
            System.out.println("-------------------------------------");

            numeros.get(i).mostrarInfo();

        }

    }
    
}

