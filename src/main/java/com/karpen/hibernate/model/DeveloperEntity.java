package com.karpen.hibernate.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "developer", schema = "public", catalog = "hibernate")
public class DeveloperEntity {
    private int idDeveloper;
    private String firstname;
    private String lastname;

    @Id
    @Column(name = "id_developer")
    public int getIdDeveloper() {
        return idDeveloper;
    }

    public void setIdDeveloper(int idDeveloper) {
        this.idDeveloper = idDeveloper;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeveloperEntity that = (DeveloperEntity) o;
        return idDeveloper == that.idDeveloper && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDeveloper, firstname, lastname);
    }
}
