package com.nttdata.hibernate.services;

import java.util.List;

import com.nttdata.hibernate.persistence.NttDataCustomer;

/**
 * Customer service interface.
 * 
 * @author tmotasan
 *
 */
public interface NttDataCustomerManagementServiceI {

	/**
	 * Insert a new client.
	 * 
	 * @param newCustomer
	 */
	public void insertNewCustomer(final NttDataCustomer newCustomer);

	/**
	 * Update an existing customer.
	 * 
	 * @param updatedCustomer
	 */
	public void updateCustomer(final NttDataCustomer updatedCustomer);

	/**
	 * Delete an existing customer.
	 * 
	 * @param deletedCustomer
	 */
	public void deleteCustomer(final NttDataCustomer deletedCustomer);

	/**
	 * Get a customer by ID.
	 * 
	 * @param customerId
	 */
	public NttDataCustomer searchById(final Long customerId);

	/**
	 * Get all existing customers.
	 * 
	 * @param customerId
	 * @return List<NttDataCustomer>
	 */
	public List<NttDataCustomer> searchAll();

	/**
	 * Get a customer by their full name.
	 * 
	 * @param name
	 * @param firstSurname
	 * @param secondSurname
	 * @return List<EverisPlayer>
	 */
	public List<NttDataCustomer> searchByName(final String name, final String firstSurname, final String secondSurname);

}
