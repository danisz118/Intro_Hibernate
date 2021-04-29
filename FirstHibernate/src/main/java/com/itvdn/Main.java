package com.itvdn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.setId(3);
        animal.setAge(17);
        animal.setName("Bloxastic-old");
        animal.setTail(true);

        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(animal);
        session.getTransaction().commit();
        session.close();


    }
}
