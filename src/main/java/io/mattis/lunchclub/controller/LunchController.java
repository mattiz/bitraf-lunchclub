package io.mattis.lunchclub.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Mathias Bjerke
 */
@Controller
public class LunchController {

	@RequestMapping( value = "/lunch", method = RequestMethod.GET )
	public String index( Model model ) {
		return "index";
	}

}
