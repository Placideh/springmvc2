package com.placideh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class AddSevlet {
	@RequestMapping("addition")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletRequest request ,HttpServletResponse response) {
		//using httpServlet
//		int i=Integer.parseInt(request.getParameter("t1"));
//		int j=Integer.parseInt(request.getParameter("t2"));
		AddService add=new AddService();
		int result =add.add(i,j);
		ModelAndView mv=new ModelAndView();
		mv.addObject("result",result);
		mv.setViewName("display");
		return mv;
	}

}
