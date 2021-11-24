package com.nttdata.hibernate;

import java.util.List;

import org.hibernate.Session;

import com.nttdata.hibernate.persistence.NttDataCustomer;
import com.nttdata.hibernate.services.NttDataCustomerManagementServiceI;
import com.nttdata.hibernate.services.NttDataCustomerManagementServiceImpl;

/**
 * Main class
 * 
 * @author tmotasan
 *
 */
public class NttDataHibernateMainT1 {
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Session opening
		final Session session = NttDataHibernateUtil.getSessionFactory().openSession();

		// Initialization of services
		final NttDataCustomerManagementServiceI service = new NttDataCustomerManagementServiceImpl(session);

		// Customer generation
		final NttDataCustomer cust1 = new NttDataCustomer();
		cust1.setNombre("Tomás");
		cust1.setPrimerApellido("Mota");
		cust1.setSegundoApellido("Sánchez");
		cust1.setDni("20072402A");

		final NttDataCustomer cust2 = new NttDataCustomer();
		cust2.setNombre("Agustín");
		cust2.setPrimerApellido("Guerrero");
		cust2.setSegundoApellido("Rey");
		cust2.setDni("85498721A");

		service.insertNewCustomer(cust1);
		service.insertNewCustomer(cust2);

		// List of all clients
		List<NttDataCustomer> list = service.searchAll();
		System.out.println(list);

		// Search for a client by name and surname and modification
		List<NttDataCustomer> listUpdate = service.searchByName("Agustín", "Guerrero", "Rey");
		NttDataCustomer cutUpdate = listUpdate.get(0);
		cutUpdate.setSegundoApellido("Reyes");
		cutUpdate.setDni("28945632J");
		service.updateCustomer(cutUpdate);
		System.out.println("Cliente número " + cutUpdate.getId() + " actualizado.");

		// Listed again.
		list = service.searchAll();
		System.out.println(list);

		// Search for a customer by name and surname to delete
		List<NttDataCustomer> listDelete = service.searchByName("Agustín", "Guerrero", "Reyes");
		NttDataCustomer cutDelete = listDelete.get(0);
		System.out.println("Borrando cliente número " + cutDelete.getId());
		service.deleteCustomer(cutDelete);

		// List of clients again
		list = service.searchAll();
		System.out.println(list);

		// Log out.
		session.close();

	}
}
