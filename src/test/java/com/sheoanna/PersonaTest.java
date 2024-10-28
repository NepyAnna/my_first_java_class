package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testConstructor() {
        String name = "Hanna";
        String surname = "Sun";
        String id = "AA 123456";
        LocalDate dateOfBirth = LocalDate.of(2004, 12, 24);
        String country = "Spain";
        Gender personGender = Gender.M;
        
        Persona newPersona = new Persona(name, surname, id, dateOfBirth, country, personGender);
        
        assertEquals(name, newPersona.getName());
        assertEquals(surname, newPersona.getSurname());
        assertEquals(id, newPersona.getID());
        assertEquals(dateOfBirth, newPersona.getDateOfBirth());
        assertEquals(country, newPersona.getCountryOfBirth());
        assertEquals("Female", newPersona.getGender());
    }

    @Test
    void testPrintPersonaData() {
        String name = "Hanna";
        String surname = "Sun";
        String id = "AA 123456";
        LocalDate dateOfBirth = LocalDate.of(2004, 12, 24);
        String country = "Spain";
        Gender  personGender = Gender.M;

        Persona newPersona = new Persona(name,  surname,  id, dateOfBirth, country, personGender);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        newPersona.printPersonaData();

        String expectedOutput = "Name: " + name + " " + surname
        + ";\nDate of birth: " + dateOfBirth
        + ";\nNumber of ID: " + id
        + ";\nCountry of Birth: " + country
        + ";\nGender: " + newPersona.getGender() + ".\n";

        assertEquals(expectedOutput, outputStream.toString());

        System.setOut(System.out);
    }

    @Test
    void testGetGender() {
        Persona personaWoman = new Persona("Lana", "Sun", "AB 123456", LocalDate.of(2004, 4, 4), "Spain", Gender.O);
        Persona personaMan = new Persona("Andrew", "Moon", "BB 123456", LocalDate.of(2012, 12, 12), "France", Gender.H);
       
        assertEquals("Others", personaWoman.getGender());
        assertEquals("Male", personaMan.getGender());
    }
}
