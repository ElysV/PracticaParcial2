package Codigo;

public class O_Opiniones {

    public void mostrarOpiniones(){

        int opcion = 0;

        do{

            try {

                System.out.println("\n------------------------------------------");
                System.out.println("|                                        |");
                System.out.println("|   OPINIONES DE LOS ESTUDIANTES SOBRE   |");
                System.out.println("|           EL LABORATORIO N°4           |");
                System.out.println("|                                        |");
                System.out.println("|  Seleccione Una Opción:                |");
                System.out.println("|                                        |");
                System.out.println("|  1) Elys Vergara                       |");
                System.out.println("|                                        |");
                System.out.println("|  2) Liz Herrera                        |");
                System.out.println("|                                        |");
                System.out.println("|  3) Regresar al Menú Principal         |");
                System.out.println("|                                        |");
                System.out.println("------------------------------------------");

                System.out.print("\nElija una opción: ");

                opcion = Integer.parseInt(X_Leer.leer.readLine());

                switch (opcion) {

                    case 1:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");

                        System.out.println("------------------------------");
                        System.out.println("|  ESTUDIANTE: ELYS VERGARA  |");
                        System.out.println("------------------------------");
                        System.out.println("\n» Este laboratorio me ayudó a mejorar mi estructura de código.");
                        System.out.println("» Repasé conceptos que ya dominaba y mejoré mi estructura de código.");
                        
                    break;

                    case 2:

                        System.out.println("\n------------------------------");
                        System.out.println("|  Has elegido la opción: " + opcion + "  |");
                        System.out.println("------------------------------");

                        System.out.println("------------------------------");
                        System.out.println("|  ESTUDIANTE: LIZ HERRERA   |");
                        System.out.println("------------------------------");
                        System.out.println("\n» Considero que logré cumplir con el objetivo del laboratorio.");
                        System.out.println("» Esta asignación me ayudó a reforzar mis conocimientos en validación de datos.");
                        System.out.println("» Fue una experiencia práctica que me permitió aplicar lo aprendido y mejorar mi lógica de programación.");
                        
                    break;
        
                    case 3:

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

        }while (opcion != 3);

    }
    
}