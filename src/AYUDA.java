import java.util.Scanner;

public class AYUDA {
    public static void main(String[] args) {
        System.out.println("escribe una numero de uno al diez");
        Scanner juan = new Scanner(System.in);
        double holi=juan.nextDouble();
         holi /=5;
        System.out.println(holi);
        juan.close();
        System.out.println( "nicoll va a perder el quiz");


        int numVar = 7;
        int numSecondVar = 5;
        double numResult = (double)numVar/numSecondVar;
        System.out.println(numResult);
    }
}
