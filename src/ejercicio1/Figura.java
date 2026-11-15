package ejercicio1;

public abstract class Figura {
    // Método abstracto: cada figura lo calcula a su manera
    public abstract double calcularArea();

    // Método concreto compartido por todas las figuras
    public void mostrarFigura() {
        System.out.println("Mostrando " + getClass().getSimpleName()
                + " | Área: " + calcularArea());
    }
}