package mw.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateHelper {
    private static SessionFactory sessionFactory;

    public static void prepareSessionFactory() {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public static void closeSessionFactory() {
        sessionFactory.close();

    }

    public static Session openSessionFactory() {
        return sessionFactory.openSession();
    }

}
