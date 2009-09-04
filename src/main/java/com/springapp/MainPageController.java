package com.springapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class MainPageController extends AbstractController {

  private String viewName;
	
  public ModelAndView handleRequestInternal(HttpServletRequest request, 
      HttpServletResponse response) throws Exception {
    String who = ServletRequestUtils.getStringParameter(request, "who");
    ModelAndView mav = new ModelAndView();
    mav.addObject("who", (who == null ? "NULL" : who));
    mav.setViewName(getViewName());
    return mav;
  }

/**
 * @return the viewName
 */
public String getViewName() {
	return viewName;
}

/**
 * @param viewName the viewName to set
 */
public void setViewName(String viewName) {
	this.viewName = viewName;
}

}