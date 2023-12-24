package com.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnjiController {
	
	@RequestMapping("/anji")
	public ModelAndView method()
	{
		ModelAndView model=new ModelAndView();
		model.setViewName("anji");
		return model;
	}

}
