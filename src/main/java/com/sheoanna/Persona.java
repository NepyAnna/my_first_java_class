package com.sheoanna;

import java.time.LocalDate;

public class Persona {
    private String name;
    private String surname;
    private String ID;
    private LocalDate dateOfBirth;

    public Persona (String name, String surname, String ID, LocalDate date) {
        this.name = name;
        this.surname = surname;
        this.ID =ID;
        this.dateOfBirth = date;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getID() {
        return ID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String printPersonaData() {
        return "Name: " + this.name + " " + this.surname + ";\nDate of birth: " + this.dateOfBirth + ";\nNumder of ID: " + this.ID + ".";
    }
}
