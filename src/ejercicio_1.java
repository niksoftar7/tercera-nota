import java.util.Scanner;
public class ejercicio_1 {
public static void main(String[] args) {
    Scanner inpud = new Scanner(System.in);
    System.out.println();
    int a =inpud.nextInt() ;
    int b =inpud.nextInt() ;
    System.out.println("Antes de llamar al método: a = " + a + ", b = " + b);
    intercambiar(a, b);
    System.out.println("Después de llamar al método: a = " + a + ", b = " + b);
    inpud.close();
}


public static void intercambiar (int a, int b){
    a=2;
    b=3;
    System.out.println("Dentro del método: a = " + a + ", b = " + b);
}
}
