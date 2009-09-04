package com.springapp;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import com.springapp.model.Product;
import com.springapp.model.SearchForm;

public class FormPageController extends SimpleFormController {

	  @Override
	  public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response,
			  Object command, BindException errors) throws Exception {
		  SearchForm searchParam = (SearchForm) command;
		  System.out.println("your input is ... " + searchParam);
		  
		  ModelAndView mv = null;
	 
		  mv = showForm(request, errors, getSuccessView());
		  String pName = searchParam.getName();
		  if (pName == null || pName.length() == 0) {
			  pName = "Default_"; 
		  }
		  
		  ProductSearch st = new ProductSearch();
		  st.setProducts(Util.getTableData(pName, 50));

		  HttpSession session = request.getSession();
		  session.setAttribute("myName", "Tamil");
		  session.setAttribute("TABLE_DATA", st.getAllProducts());
		  
		  session.setAttribute("pageSize", searchParam.getPageSize());
		  System.out.println("done search ..... displaying results");
		  return mv;
	}
  
	@Override
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		  SearchForm command = new SearchForm();
		  command.setName("Default_");
		  command.setPageSize("10");
		  
		  ProductSearch st = new ProductSearch();
		  st.setProducts(Util.getTableData(command.getName(), 50));
		  
		  HttpSession session = request.getSession();
		  session.setAttribute("myName", "Tamil");
		  session.setAttribute("TABLE_DATA", st.getAllProducts());
		  session.setAttribute("pageSize", command.getPageSize());
		  
		  return command;
	  }
	
	@Override
	protected boolean isFormSubmission(HttpServletRequest request) {
		return !request.getParameterMap().isEmpty();
	}
}
