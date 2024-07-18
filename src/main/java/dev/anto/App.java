package dev.anto;

import dev.anto.Automovil.tipoA;
import dev.anto.Automovil.tipoColor;
import dev.anto.Automovil.tipoCom;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Opel", 2024, 2, tipoCom.Gasolina, tipoA.Familiar, 5, 4, 180, tipoColor.Naranja, 0, true);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(20);
    }
}
