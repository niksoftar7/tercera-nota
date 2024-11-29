import java.util.Scanner;

public class ej8arrays {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        int [] numero = new int[5]; 
        for (int i=0;i<5;i++) {
            System.out.println("ingrese el numero de la posició "+ (i+1));
            numero[i] = datos.nextInt(); 
          
        }
        int suma=0;
        for (int i = 0 ; i<5 ;i++){
            suma+=numero[i];
        }
        System.out.println("CEVASTIAM PARATE A BARRER: "+ suma);
        double average = (double)suma/numero.length;
        System.out.println("el promedio es: "+ average);
        datos.close();
    
    }
   
}
