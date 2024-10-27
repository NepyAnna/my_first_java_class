package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testConstructorNameSurnameIdDate() {
        String name = "Anna";
        String surname = "Nepyivoda";
        String id = "AA 376192";
        LocalDate dateOfBirth = LocalDate.of(1984, 8, 24);
        
        Persona newPersona = new Persona(name,  surname,  id, dateOfBirth);
        
        assertEquals(name, newPersona.getName());
        assertEquals(surname, newPersona.getSurname());
        assertEquals(id, newPersona.getID());
        assertEquals(dateOfBirth, newPersona.getDateOfBirth());
    }
}
