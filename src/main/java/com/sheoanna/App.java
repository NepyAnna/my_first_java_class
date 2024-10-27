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
        Persona newPersona = new Persona("Anna", "Sun", "AD 2345678", LocalDate.of(1984, 8, 24));

        System.out.println(newPersona.dateOfBirth);
        System.out.println(newPersona.name);
        System.out.println(newPersona.surname);

    }
}
