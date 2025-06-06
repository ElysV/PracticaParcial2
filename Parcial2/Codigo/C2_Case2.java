package Codigo;
import java.util.ArrayList;

public class C2_Case2 {

    ArrayList<C2_InicializarCase2> numeros = new ArrayList<C2_InicializarCase2>();

    public void menuCalcularSumaDeDigitos(){

        int opcion = 0;

        do{

            try {

                System.out.println("\n---------------------------------------------");
                System.out.println("|                                           |");
                System.out.println("|       SUMA DE DIGITOS DE NÚMEROS          |");
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
        
                        System.out.println("\nOpción no válida. Por favor, elija una opción del menú.");
        
                    break;
        
                }
                
            } catch (Exception e) {

                M_ManejoDeExcepciones.imprimirErrores(e);

            }

        }while (opcion != 1);

        int cantidad = 0;

        do{

            try {

                System.out.println("\nCuántos números desea ingresar? ");
                System.out.print("Cantidad de números: ");
                cantidad = Integer.parseInt(X_Leer.leer.readLine());

                if(cantidad > 0){

                    break;

                }else {

                    System.out.println("\nLa cantidad debe de ser mayor que 0.");

                }

                
            } catch (Exception e) {

                M_ManejoDeExcepciones.imprimirErrores(e);

            }

        }while (true);
    
        for(int i = 0; i < cantidad; i++){
            int numero = -1;
            

            do{

                try {

                    System.out.println("\nIngrese el número #" + (i + 1) + ": ");
                    numero = Integer.parseInt(X_Leer.leer.readLine());

                    if (numero < 0){
                        System.out.println("\nNo se permiten números negativos. Intente de nuevo.");
                    } else {
                        numeros.add(new C2_InicializarCase2(numero));
                        break;
                    }

                } catch (Exception e) {
                    
                    M_ManejoDeExcepciones.imprimirErrores(e);

                }

            } while (true);

        }

        for (int i = 0; i < numeros.size(); i++) {

            System.out.println("\n---------------------");
            System.out.println("|     Número #" + (i + 1) + "     |");
            System.out.println("---------------------");
            numeros.get(i).mostrarInformacion();
            
        }

    }
}