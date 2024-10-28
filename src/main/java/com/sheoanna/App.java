package com.sheoanna;

import java.time.LocalDate;

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
        Persona personaWoman = new Persona("Lana", "Sun", "AB 123456", LocalDate.of(2004, 4, 4), "Spain", Gender.M);
        Persona personaMan = new Persona("Andrew", "Moon", "BB 123456", LocalDate.of(2012, 12, 12), "France", Gender.H);

        personaWoman.printPersonaData();
        personaMan.printPersonaData();
    }
}
