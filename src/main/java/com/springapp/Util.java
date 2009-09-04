/**
 * 
 */
package com.springapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.springapp.model.Product;

/**
 * @author ctsuser1
 *
 */
public class Util {

	public static List<Product> getTableData(String name, int rows) {
		Random randGen = new Random();
		List<Product> products = new ArrayList<Product>(); 
		for (int i=0; i <=rows ; i++) {
			Product product = new Product(i, name+randGen.nextInt(rows), "Type_"+randGen.nextInt(5));
			products.add(product);
		}
		
		return products;
	}
}
