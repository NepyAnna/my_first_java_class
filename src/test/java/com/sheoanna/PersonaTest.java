package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testConstructorNameSurnameIdDate() {

        Persona newPersona = new Persona("Anna",  "Nepyivoda",  "AA 376192", LocalDate.of(1984, 8, 24));
        
        assertEquals("Anna", newPersona.name);
        assertEquals(LocalDate.of(1984, 8, 24), newPersona.dateOfBirth);
        assertEquals("Nepyivoda", newPersona.surname);
    }
}
