package com.factory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactory {
	
	private static SessionFactory factory=null;
	static {
		StandardServiceRegistry serviceRegistry = ((Object) new StandardServiceRegistryBuilder().configure()).build();
		 factory = new MetadataSources().buildMetadata().buildSessionFactory();
	}
	private HibernateSessionFactory() {}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
