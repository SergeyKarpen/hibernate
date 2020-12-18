package com.karpen.hibernate.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "skill", schema = "public", catalog = "hibernate")
public class SkillEntity {
    private int idSkill;
    private String name;

    @Id
    @Column(name = "id_skill")
    public int getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(int idSkill) {
        this.idSkill = idSkill;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillEntity that = (SkillEntity) o;
        return idSkill == that.idSkill && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSkill, name);
    }
}
