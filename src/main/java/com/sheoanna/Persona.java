package com.sheoanna;

import java.time.LocalDate;

public class Persona {
    public String name;
    public String surname;
    public String ID;
    public LocalDate dateOfBirth;

    public Persona (String name, String surname, String ID, LocalDate date) {
        this.name = name;
        this.surname = surname;
        this.ID =ID;
        this.dateOfBirth = date;
    }
}
