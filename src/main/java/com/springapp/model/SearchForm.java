/**
 * 
 */
package com.springapp.model;

/**
 * @author ctsuser1
 *
 */
public class SearchForm {
	
	private String name;
	
	private String type;
	
	private String pageSize;


	/**
	 * @return the pageSize
	 */
	public String getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
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
	
	public String  toString(){
		return "Name : " + this.name + ", Type : " + this.type + " Page Size: " + this.pageSize;
	}
	

}
