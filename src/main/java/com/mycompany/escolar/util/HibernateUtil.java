/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escolar.util;

//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author colunga
 */
public class HibernateUtil {

  private static final SessionFactory sessionFactory;
  private static ServiceRegister serviceRegistry;
  static {
    try {
      // Create the SessionFactory from standard (hibernate.cfg.xml) 
      // config file.
      
      //        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
      //sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory(); 
      Configuration configuration = new Configuration().configure();

StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
  sessionFactory = configuration.buildSessionFactory(builder.build());

     

    } catch (Throwable ex) {
      // Log the exception. 
      System.err.println("Initial SessionFactory creation failed." + ex);
      throw new ExceptionInInitializerError(ex);
    }
  }
  
  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  private static class ServiceRegister {

    public ServiceRegister() {
    }
  }
}
