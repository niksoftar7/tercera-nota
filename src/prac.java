import java.util.Scanner;

public class prac {

    public static void main(String[] args) {
        
        int agePerson = 18;
        double hightPerson =1.63;
        char initialName = 'n';
        boolean moreAge = agePerson>=18;
        
        System.out.println("la edad de la persona es " + agePerson);
        System.out.println("la altura de la persona es " + hightPerson);
        System.out.println("la inicial de la persona es " + initialName);
        System.out.println("la persona es mayor de edad? = " + moreAge);

        final double vlorPi =3.1416;
        double radio = 5;
        double area = vlorPi * radio;
        agePerson -=17;
        System.out.println(agePerson);
        System.out.println("el area es " + area);

//ejercicio descuentos;
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

        Scanner banco = new  Scanner (System.in);
        System.out.println("ingrese su saldo ingresado de cuenta");
        double saldoCuenta = banco.nextDouble();
        final double descuentoFijo = 200;
        final int cantidadDias = 30;
        double cantidadFinal = saldoCuenta - (descuentoFijo*cantidadDias);
        System.out.println("su plata a fin de mes será de " + cantidadFinal);
        banco.close();

        int numVar = 7;
        int numSecondVar = 5;
        double numResult = numVar/numSecondVar;
        System.out.println(numResult);

    }
}
