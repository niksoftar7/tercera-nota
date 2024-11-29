import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner lector = new  Scanner (System.in);
        System.out.println("ingrese el numero uno");
        double oneVariable = lector.nextDouble();
        System.out.println("ingrese el numero dos");
        double twoVariable = lector.nextDouble();
        System.out.println("ingrese el numero tres");
        double threeVariable = lector.nextDouble();
        double media=(oneVariable+twoVariable+threeVariable)/3;
        System.out.println("la media de los numeros ingresados es " + media);
        lector.close();
    }

}
 