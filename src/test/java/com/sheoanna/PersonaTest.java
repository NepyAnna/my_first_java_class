package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
        String name = "Anna";
        String surname = "Nepyivoda";
        String id = "AA 123456";
        LocalDate dateOfBirth = LocalDate.of(2004, 12, 24);

        Persona newPersona = new Persona(name,  surname,  id, dateOfBirth);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        newPersona.printPersonaData();

        String expectedOutput = "Name: " + name + " " + surname + ";\nDate of birth: " + dateOfBirth + ";\nNumber of ID: " + id + ".";

        assertEquals(expectedOutput, outputStream.toString());

        System.setOut(System.out);
    }

}
