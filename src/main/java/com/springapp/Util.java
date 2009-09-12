/**
 * 
 */
package com.springapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.springapp.model.Product;

/**
 * @author ctsuser1
 *
 */
public class Util {

	private static Map<String,List<Product>> cacheBucket = new HashMap<String, List<Product>>();
	
	public static List<Product> getTableData(String name, int rows) {
		
		List<Product> ps = cacheBucket.get(name);
		if(ps != null && ps.size() == rows)
			return ps;
		else if(ps == null || ps.size() == 0) {
			Random randGen = new Random();
			ps = new ArrayList<Product>(); 
			for (int i=0; i <=rows ; i++) {
				Product product = new Product(i, name+randGen.nextInt(rows), "Type_"+randGen.nextInt(5));
				ps.add(product);
			}
			
			cacheBucket.put(name, ps);

		}
		return ps;
	}
}
