package com.nttdata.hibernate.persistence;

import java.util.List;

import org.hibernate.Session;

/**
 * Table DAO NTTDATA_TH1_CUSTOMER
 * 
 * @author tmother
 * @param <T>
 *
 */
public class NttDataCustomerDaoImpl implements NttDataCustomerDaoI {

	// /** Class type */
	// private Class<T> entityClass;

	/** DataBase connection session*/
	private Session session;

	/**
	 * Constructor method.
	 * 
	 * @param session
	 */
	public NttDataCustomerDaoImpl(Session session) {
		// setEntityClass((Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
		this.session = session;
	}

	@Override
	public void insert(NttDataCustomer cliente) {

		// Open session verification.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Insertion.
		session.save(cliente);
		session.flush();

		// Commit.
		session.getTransaction().commit();

	}

	@Override
	public void update(NttDataCustomer cliente) {

		// Open session verification.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Insertion.
		session.saveOrUpdate(cliente);

		// Commit.
		session.getTransaction().commit();

	}

	@Override
	public void delete(NttDataCustomer cliente) {

		// Open session verification.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Insertion.
		session.delete(cliente);

		// Commit.
		session.getTransaction().commit();

	}

	@Override
	public NttDataCustomer searchById(Long id) {

		// Open session verification.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Search by PK.
		NttDataCustomer result = (NttDataCustomer) session.get(NttDataCustomer.class, id);

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NttDataCustomer> searchAll() {

		// Open session verification.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Search all records.
		List<NttDataCustomer> list = session.createQuery("FROM NttDataCustomer").list();

		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NttDataCustomer> searchByNameAndSurname(String name, String firstSurname, String secondSurname) {

		// Open session verification.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Locate clients based on first name, first surname and second surname.
		final List<NttDataCustomer> playersList = session
		        .createQuery("FROM NttDataCustomer WHERE NOMBRE= :nombre AND PRIMER_APELLIDO = :primer AND SEGUNDO_APELLIDO= :segundo")
		        .setParameter("nombre", name).setParameter("primer", firstSurname).setParameter("segundo", secondSurname).list();

		return playersList;

	}

}
