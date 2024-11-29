import java.util.Scanner;

public class praclass2 {
    public static void main(String[] args) {
        Scanner libreria = new Scanner (System.in);
        System.out.println("ingrese #1");
        int number1 = libreria.nextInt();

        System.out.println("ingrese #2");
        int number2 = libreria.nextInt();

        System.out.println("ingrese #3");
        int number3 = libreria.nextInt();

        System.out.println("number1 > number2 && number2 < number3 " + (number1 > number2 && number2 < number3));
        System.out.println("number1 < number2 || number2 > number3 " + (number1 < number2 || number2 > number3));
        System.out.println("!(number1 > number2) " + !(number1 > number2));
        libreria.close();
    }
       
    

}
