package com.sheoanna;

import java.time.LocalDate;

enum Gender {
    H,
    M,
    O
};

public class Persona {
    private String name;
    private String surname;
    private String ID;
    private LocalDate dateOfBirth;

    private String countryOfBirth;
    private Gender personGender;

    public Persona (String name, String surname, String ID, LocalDate date, String country, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.ID =ID;
        this.dateOfBirth = date;
        this.countryOfBirth = country;
        this.personGender = gender;
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

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getGender() {
        switch (personGender) {
            case H: return "Male";
            case M: return "Female";
            case O: return "Others";
            default: return "Undefinded";
        }
    }

    void printPersonaData() {
        System.out.println("Name: " + this.name + " " +this.surname + ";\nDate of birth: " + this.dateOfBirth + ";\nNumber of ID: " + this.ID + ".");
    }
}
