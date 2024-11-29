import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner NumeroGuardado = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int numeroLeer = NumeroGuardado.nextInt();
        System.out.println("numero leido "+numeroLeer);
        NumeroGuardado.close();


    }

}
