package com.karpen.hibernate.controller;

import com.karpen.hibernate.model.Skill;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.karpen.hibernate.repository.impl.*;

public class SkillController {

    private final HibernateSkillRepoImpl hibernateSkillRepo = new HibernateSkillRepoImpl();


    public void create(String name) throws IOException, SQLException {
        Skill skill = new Skill();
        skill.setName(name);
        hibernateSkillRepo.create(skill);
    }

    public Skill update(Long id, String name) throws IOException, SQLException {
        Skill skill = new Skill();
        skill.setName(name);
        skill.setId(id);
        return hibernateSkillRepo.update(skill);
    }
/*
    public Skill getById(Long id) throws IOException, SQLException {
        return hibernateSkillRepo.getById(id);
    }

 */

    public void deleteById(Long id) throws IOException, SQLException {
        hibernateSkillRepo.deleteById(id);
    }

    public List<Skill> getAll() throws IOException, SQLException {
        return hibernateSkillRepo.getAll();
    }


}
