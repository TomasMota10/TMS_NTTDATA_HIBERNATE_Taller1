package com.nttdata.hibernate.persistence;

import java.util.List;

/**
 * Table DAO NTTDATA_TH1_CUSTOMER
 * 
 * @author tmotasan
 *
 */
public interface NttDataCustomerDaoI {

	/**
	 * Insert a new Client
	 * 
	 * @param client
	 *            - the client to insert
	 */
	public void insert(final NttDataCustomer cliente);

	/**
	 * Update a Client's records
	 * 
	 * @param client
	 *            - the client to update
	 */
	public void update(final NttDataCustomer cliente);

	/**
	 * Delete a Client
	 * 
	 * @param client
	 *            - the client to delete
	 */
	public void delete(final NttDataCustomer cliente);

	/**
	 * Search for a Client by the given ID
	 * 
	 * @param id
	 *            - the ID of the client we want to search
	 * 
	 * @return NttDataCustomer
	 */
	public NttDataCustomer searchById(final Long id);

	/**
	 * Returns all Clients in the DataBase
	 * 
	 * @return List<NttDatacustomer> - Client list
	 */
	public List<NttDataCustomer> searchAll();

	/**
	 * 
	 * Search for a Client by name and two surnames
	 * 
	 * @param name
	 *            - Client's name
	 * @param firstSurname
	 *            - Client's first surname
	 * @param secondSurname
	 *            - Client's second last name
	 * 
	 * @return List<NttDatacustomer> - Client list
	 */
	public List<NttDataCustomer> searchByNameAndSurname(final String name, final String firstSurname, final String secondSurname);

}
