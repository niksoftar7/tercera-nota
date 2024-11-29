import java.util.Scanner;;
public class ej3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese el numero");
        float number = scanner.nextFloat();
        System.out.println("ingrese el segundo numero");
        float number2 = scanner.nextFloat();
        float suma=number + number2;
        float resta=number - number2;
        float multiplicacion=number * number2;
        float division=number / number2;
        float modulo= number % number2;

        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la multiplicacion es " + multiplicacion);
        System.out.println("la division es " + division);
        System.out.println("el residuo es " + modulo);
        scanner.close();



    
}
}
