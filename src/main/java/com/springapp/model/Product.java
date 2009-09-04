/**
 * 
 */
package com.springapp.model;

/**
 * @author ctsuser1
 *
 */
public class Product {

	private int id;
	
	private String name;
	
	private String type;
	 

	public Product(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		
		return "Product [id="+id+", name="+name+", type="+type+"]";
	}
}
