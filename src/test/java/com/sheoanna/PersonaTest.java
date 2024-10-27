package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testConstructorNameSurnameIdDate() {
        String name = "Anna";
        String surname = "Nepyivoda";
        String id = "AA 123456";
        LocalDate dateOfBirth = LocalDate.of(2004, 12, 24);
        
        Persona newPersona = new Persona(name,  surname,  id, dateOfBirth);
        
        assertEquals(name, newPersona.getName());
        assertEquals(surname, newPersona.getSurname());
        assertEquals(id, newPersona.getID());
        assertEquals(dateOfBirth, newPersona.getDateOfBirth());
    }

    @Test
    void testPrintPersonaData() {
        Persona persona = new Persona("Anna", "Nepyivoda", "AA 123456", LocalDate.of(2004, 12, 24));
        
        String expectedOutput = "Name: Anna Nepyivoda;\nDate of birth: 2004-12-24;\nNumder of ID: AA 123456.";
        assertEquals(expectedOutput, persona.printPersonaData());
    }
   

}
