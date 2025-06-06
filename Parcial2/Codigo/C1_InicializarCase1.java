package Codigo;
import java.math.BigInteger;

public class C1_InicializarCase1 {

    private int numeroFactorial;
    private BigInteger resultadoFactorial = BigInteger.ONE;

    public C1_InicializarCase1(int numeroFactorial) {

        this.numeroFactorial = numeroFactorial;
        this.resultadoFactorial = BigInteger.ONE;

    }

    public int getNumeroFactorial() {

        return numeroFactorial;

    }

    public void setNumeroFactorial(int numeroFactorial) {

        this.numeroFactorial = numeroFactorial;
        
    }

    public void mostrarInfo(){

        System.out.println("\nNúmero Factorial: " + numeroFactorial + "!");

        calcularFactorial();
        
    }

    public void calcularFactorial() {

        for(int i = 1; i <= numeroFactorial; i++) {

            resultadoFactorial = resultadoFactorial.multiply(BigInteger.valueOf(i));

        }

        System.out.println("Resultado: " + resultadoFactorial);

    }

}
