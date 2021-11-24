package com.nttdata.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Configuration class
 * 
 * @author tmotasan
 *
 */
public class NttDataHibernateUtil {

	/** Session factory */
	private static final SessionFactory SESSION_FACTORY;

	/**
	 * Session factory generation.
	 */
	static {

		try {

			// Configuration generation
			SESSION_FACTORY = new Configuration().configure().buildSessionFactory();

		} catch (final Throwable ex) {

			// Initialization error
			System.err.println("[ERROR] Configuración de Hibernate - " + ex);
			throw new ExceptionInInitializerError();
		}

	}

	/**
	 * The sessions factory returns
	 * 
	 * @return SessionFactory
	 */
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
