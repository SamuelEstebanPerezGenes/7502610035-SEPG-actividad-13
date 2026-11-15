package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura r = new Rectangulo(5, 3);
        Figura t = new Triangulo(6, 4);

        r.mostrarFigura();
        t.mostrarFigura();
    }
}