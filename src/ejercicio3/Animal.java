package ejercicio3;

public abstract class Animal {

    public abstract void hacerSonido();

    // Esto SÍ es válido: un método concreto normal
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    // --- Descomenta para ver el error de compilación ---
    // default void despertar() {
    //     System.out.println("El animal despierta.");
    // }
    // Error: modifier 'default' not allowed here
}