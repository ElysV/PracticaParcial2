package Codigo;
import java.util.ArrayList;

public class C3_Case3 {

    ArrayList<C3_InicializarCase3> intervalos = new ArrayList<C3_InicializarCase3>();

    public void menuCalcularPrimos (){

        int opcion = 0;

        do{

            try {

                System.out.println("\n---------------------------------------------");
                System.out.println("|                                           |");
                System.out.println("|          CALCULAR NÚMEROS PRIMOS          |");
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

                System.out.println("\n¿Qué cantidad de veces desea verificar cuántos números primos hay dentro de dos números?");
                System.out.print("Cantidad: ");
                cantidad = Integer.parseInt(X_Leer.leer.readLine());

                if(cantidad > 0){

                    break;

                }else {

                    System.out.println("\nLa cantidad debe de ser mayor a 0.");

                }

                
            } catch (Exception e) {

                M_ManejoDeExcepciones.imprimirErrores(e);

            }

        }while (true);
    
        for(int i = 0; i < cantidad; i++){
            int n1 = 0, n2 = 0;

            do{

                try {

                    System.out.println("\nIntervalo N°" + (i + 1) + ":");

                    System.out.print("\nIngrese el primer número (n1):");
                    n1 = Integer.parseInt(X_Leer.leer.readLine());
        
                    System.out.print("\nIngrese el segundo número (n2):");
                    n2 = Integer.parseInt(X_Leer.leer.readLine());

                    if (n1 < n2){
                        intervalos.add(new C3_InicializarCase3(n1, n2));
                        break;
                    } else {
                        System.out.println("\n n1 debe de ser menor que n2. Por favor; intente de nuevo.");
                    }

                } catch (Exception e) {
                    M_ManejoDeExcepciones.imprimirErrores(e);
                }
            } while (true);
        }

        for (int i = 0; i < intervalos.size(); i++) {
            System.out.println("\n---------------------");
            System.out.println("|     Intervalo N°" + (i + 1) + "     |");
            System.out.println("---------------------");

            intervalos.get(i).mostrarInformacion();
        }
    }
}

                    