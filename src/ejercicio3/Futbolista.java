package ejercicio3;

public class Futbolista implements Jugador {

    // --- Comenta este método para ver el error de compilación ---
    // Error: 'Futbolista' is not abstract and does not override abstract method jugar() in 'Jugador'
    @Override
    public void jugar() {
        System.out.println("El futbolista está jugando.");
    }
}