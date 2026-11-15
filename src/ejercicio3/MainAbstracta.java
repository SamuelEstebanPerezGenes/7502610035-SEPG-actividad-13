package ejercicio3;

public class MainAbstracta {
    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.hacerSonido();
        perro.dormir();

        // --- Descomenta para ver otro error de compilación ---
        // Animal a = new Animal(); // Error: 'Animal' is abstract; cannot be instantiated
    }
}