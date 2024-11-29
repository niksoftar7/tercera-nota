import java.util.Scanner;
public class ej6 {
    public static void main(String[] args) {
        Scanner valorPrenda = new  Scanner (System.in);
        System.out.println("ingrese el precio de la camiseta");
        float camiseta = valorPrenda.nextFloat();
        final int descuento = 15;
        double descuentoCamiseta =camiseta-( (camiseta/100)*descuento);
        System.out.println("ingrese el precio del pantalon");
        float pantalon = valorPrenda.nextFloat();
        double descuentoPantalon = pantalon-( (pantalon/100)*descuento);
        double precioFinal = descuentoCamiseta+descuentoPantalon;
        System.out.println("el precio final de la compra es "+precioFinal);
        valorPrenda.close();
    
    }
   
}
