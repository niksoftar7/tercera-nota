import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner banco = new  Scanner (System.in);
        System.out.println("ingrese su saldo actual de cuenta");
        double saldoCuenta = banco.nextDouble();
        final double descuentoFijo = 200;
        final int cantidadSemanas = 4;
        double cantidadFinal = saldoCuenta - (descuentoFijo*cantidadSemanas);
        System.out.println("su plata a fin de mes será de " + cantidadFinal);
        banco.close();
    }

}
