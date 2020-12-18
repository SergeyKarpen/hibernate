package com.karpen.hibernate;

import com.karpen.hibernate.util.HibernateSessionFactory;
import com.karpen.hibernate.view.MainMenu;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

class Run {
    private static SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();


    public static void main(String[] args) throws SQLException {

        MainMenu runner = new MainMenu();
        try {
            runner.showMainMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
