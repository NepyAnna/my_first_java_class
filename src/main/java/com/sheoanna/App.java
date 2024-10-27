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
        Persona newPersona = new Persona("Lana", "Sun", "AB 123456 ", LocalDate.of(1994, 4, 4));

        System.out.println(newPersona.printPersonaData());


    }
}
