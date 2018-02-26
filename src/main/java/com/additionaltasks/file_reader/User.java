package com.additionaltasks.file_reader;

import java.time.LocalDate;

public class User {

    private int id;
    private String firstname;
    private String lastName;
    private LocalDate birthDate;
    private String phone;

    public User(int id, String firstname, String lastName, LocalDate birthDate, String phone) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (!firstname.equals(user.firstname)) return false;
        if (!lastName.equals(user.lastName)) return false;
        return birthDate.equals(user.birthDate);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + firstname.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + birthDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", phone='" + phone + '\'' +
                '}';
    }
}
