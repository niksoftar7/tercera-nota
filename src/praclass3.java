import java.util.Scanner;

public class praclass3 {
    public static void main(String[] args) {
        Scanner libreria = new Scanner (System.in);
        System.out.println("ingrese #1");
        int number1 = libreria.nextInt();

        System.out.println("ingrese #2");
        int number2 = libreria.nextInt();

        System.out.println("ingrese #3");
        int number3 = libreria.nextInt();

        System.out.println("el primer numero es mayor al segundo y menor que el tercero? " + (number1 > number2 && number1 < number3));
        
        libreria.close();
    }
       
    

}
