class Rectangulo {
    double ancho;
    double alto;

    Rectangulo(double ancho,double alto){
        this.ancho=ancho;
        this.alto=alto;
    }
}

public class ej2 {
    
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10,15);
        System.out.println(rectangulo.alto+ " "+rectangulo.ancho);
        cambiarRectangulo(rectangulo);
        System.out.println(rectangulo.alto + " "+ rectangulo.ancho);

    }

    public static void  cambiarRectangulo (Rectangulo P){
        P.ancho=0;
        P.alto=0;
        
    }

    
}
