package Codigo;
public class C2_InicializarCase2 {

    private int numero;
    

    public C2_InicializarCase2(int numero) {
        this.numero = numero;

    }

    public int getnumero(){

        return numero;

    }

    public void setnumeor(int numero){

        this.numero = numero;

    }

    public int  menuCalcularSumaDeDigitos(){
        int suma = 0;
        int temp = numero;
        while (temp > 0) { //ciclo para extraer y sumar digitos 
            suma += temp % 10;
            temp /= 10;
        }
        return suma;
    }

    public void mostrarInformacion() {
        System.out.println("\nNúmero ingresado: " + numero);
        System.out.println("Suma de sus dígitos: " + menuCalcularSumaDeDigitos());
    }
}

    

    