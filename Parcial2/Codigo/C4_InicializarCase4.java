package Codigo;
public class C4_InicializarCase4 {

    private int n1;
    private int n2;

    public C4_InicializarCase4(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getn1() {
        return n1;
    }

    public void setn1(int n1) {
        this.n1 = n1;
    }

    public int getn2() {
        return n2;
    }

    public void setn2(int n2) {
        this.n2 = n2;
    }

    public void mostrarInformacion() {
        int cantidadPrimos = 0;
        int sumaPrimos = 0;
        String listaPrimos = "";

        for (int i = n1; i <= n2; i++) {
            if (esPrimo(i)) {
                cantidadPrimos++;
                sumaPrimos += i;
                listaPrimos += i + " ";
            }
        }

        System.out.println("Números primos entre " + n1 + " y " + n2 + ":");
        if (cantidadPrimos == 0) {
            System.out.println("No hay números primos en este intervalo.");
        } else {
            System.out.println(listaPrimos);
            System.out.println("\nCantidad total de primos: " + cantidadPrimos);
            System.out.println("\nSuma de los primos: " + sumaPrimos);
        }
    }
    
    private boolean esPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}