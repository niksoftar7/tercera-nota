import java.util.Scanner;

public class praclass {
    public static void main(String[] args) {
        Scanner libreria = new Scanner (System.in);
        System.out.println("ingrese el numero 1");
        int number1 = libreria.nextInt();

        System.out.println("ingrese el numero 2");
        int number2 = libreria.nextInt();

        System.out.println("son iguales? " + (number1==number2));
        System.out.println("son distintos? " + (number1!=number2));
        System.out.println("numero uno es menor que numero dos? " + (number1<number2));
        System.out.println("nujmero uno es mayor que numero dos? " + (number1>number2));
        System.out.println("nunemro uno es menor o igual a numero 2?" + (number1<=number2));
        System.out.println("numero uno es mayor o igual al dos? " + (number1>=number2));
        System.out.println("numero uno es mayor o igual al dos? " + (number1>=number2));


        libreria.close();
    }
    


}
