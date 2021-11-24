package com.nttdata.hibernate.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Table entity NTTDATA_TH1_CUSTOMER
 * 
 * 
 * @author tmotasan
 *
 */

@Entity
@Table(name = "NTTDATA_TH1_CUSTOMER")
public class NttDataCustomer implements Serializable {

	/** Serial version */
	private static final long serialVersionUID = 1L;

	/** Identifier (PK) */
	private Long id;

	/** Customer name */
	private String nombre;

	/** Surname */
	private String primerApellido;

	/** Second surname */
	private String segundoApellido;

	/** Client NIF */
	private String dni;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@Column(name = "NOMBRE", nullable = false)
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the surname
	 */
	@Column(name = "PRIMER_APELLIDO", nullable = false)
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the second surname
	 */
	@Column(name = "SEGUNDO_APELLIDO", nullable = false)
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param second surname
	 *            the second surname to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the NIF
	 */
	@Column(name = "DNI", nullable = false, unique = true, length = 9)
	public String getDni() {
		return dni;
	}

	/**
	 * @param NIF
	 *            the NIF to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "NttDataCustomer [nombre=" + nombre + ", primer_apellido=" + primerApellido + ", segundo_apellido=" + segundoApellido + ", dni=" + dni + "]";
	}

	@Transient
	public Class<?> getClase() {
		return NttDataCustomer.class;
	}

}
