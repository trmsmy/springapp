/**
 * 
 */
package com.springapp;

import java.util.ArrayList;
import java.util.List;

import com.springapp.model.Product;

/**
 * @author ctsuser1
 *
 */
public class ProductSearch {
	
	private List<Product> products;

	/**
	 * @return the products
	 */
	public List<Product> getAllProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public List<Product> getProductsByName(String name) {
		
		List<Product> nameList = new ArrayList<Product>(); 
		for (Product product : products) {
			if(product.getName().indexOf(name) > -1) {
				nameList.add(product);
			}
		}
		
		return nameList;
	}
	
	public List<Product> getProductsByType(String type) {
		
		List<Product> typeList = new ArrayList<Product>(); 
		for (Product product : products) {
			if(product.getName().indexOf(type) > -1) {
				typeList.add(product);
			}
		}
		
		return typeList;
	}
	
	
	

}
