
import java.util.Arrays;

public class Geometrias {
    public static void main (String[] args) {

        Rectangulo[] rects = new Rectangulo[4];
        Circulo[] circs = new Circulo[4];
        Triangulo[] tris = new Triangulo[4];
        
        rects[0] = new Rectangulo(2.5,3.0);
        rects[1] = new Rectangulo(1.7,2.2);
        rects[2] = new Rectangulo(2.8,3.1);
        rects[3] = new Rectangulo(3.5,1.2);

        circs[0] = new Circulo(2.5);
        circs[1] = new Circulo(1.7);
        circs[2] = new Circulo(2.8);
        circs[3] = new Circulo(3.5);

        tris[0] = new Triangulo(2.5,3.0);
        tris[1] = new Triangulo(1.7,2.2);
        tris[2] = new Triangulo(2.8,3.1);
        tris[3] = new Triangulo(3.5,1.2);
 
        Arrays.sort(rects);
        Arrays.sort(circs);
        Arrays.sort(tris);

        System.out.println("Rectangulos ordenados por area:\n");
        for(Rectangulo r : rects){
            System.out.println("Area: " + r.calcularArea() + " lados: " + r.lados()+"\n");
        }

        System.out.println("\nCirculos ordenados por area:\n ");
        for(Circulo c : circs){
            System.out.println("Area: " + c.calcularArea() + " lados: " + c.lados()+"\n");
        }

        System.out.println("\nTriangulos ordenados por area:\n ");
        for(Triangulo t : tris){
            System.out.println("Area: " + t.calcularArea() + " lados: " + t.lados()+"\n");
        }




      


    }
    
}
