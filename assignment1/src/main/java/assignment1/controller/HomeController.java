package assignment1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.service.Addservice;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Happpp");
		return "index1";
		
	}
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		
		Addservice as= new Addservice();
		int k=as.add(i, j);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("addition");
		mv.addObject("Plus",k);
		
		return mv; 
		
	}
	@GetMapping("/add/{num1}/{num2}")
	public ModelAndView add1(@PathVariable int num1,@PathVariable int num2) {
		int k=num1+num2;
		ModelAndView mv= new ModelAndView();
		mv.setViewName("addition");
		mv.addObject("Plus",k);
		System.out.println(k);
		return mv;
		
	}

	
	
	@RequestMapping("/mul")
	public ModelAndView mul(HttpServletRequest request,HttpServletResponse response) {
		
		int i=Integer.parseInt(request.getParameter("v1"));
		int j=Integer.parseInt(request.getParameter("v2"));
		
		
		Addservice as= new Addservice();
		int k=as.mul(i, j);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("multiply");
		mv.addObject("into",k);
		
		return mv; 
		
	}
	
	@GetMapping("/mul/{num1}/{num2}")
	public ModelAndView mul1(@PathVariable int num1,@PathVariable int num2) {
		int k=num1*num2;
		ModelAndView mv= new ModelAndView();
		mv.setViewName("multiply");
		mv.addObject("into",k);
		
		return mv;
		
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub(HttpServletRequest request,HttpServletResponse response) {
		
		int x=Integer.parseInt(request.getParameter("u1"));
		int y=Integer.parseInt(request.getParameter("u2"));
		
		Addservice as= new Addservice();
		int k=as.sub(x, y);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("substract");
		mv.addObject("subs",k);
		
		return mv; 
		
	}
	@GetMapping("/sub/{num1}/{num2}")
	public ModelAndView sub1(@PathVariable int num1,@PathVariable int num2) {
		int k=num1-num2;
		ModelAndView mv= new ModelAndView();
		mv.setViewName("substract");
		mv.addObject("subs",k);
		
		return mv;
		
	}
	
	@RequestMapping("/div")
	public ModelAndView div(HttpServletRequest request,HttpServletResponse response) {
		
		int x=Integer.parseInt(request.getParameter("w1"));
		int y=Integer.parseInt(request.getParameter("w2"));
		
		Addservice as= new Addservice();
		int k=as.div(x, y);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("divide");
		mv.addObject("divid",k);
		
		return mv; 
		
	}
	
	@GetMapping("/div/{num1}/{num2}")
	public ModelAndView div1(@PathVariable int num1,@PathVariable int num2) {
		int k=num1/num2;
		ModelAndView mv= new ModelAndView();
		mv.setViewName("divide");
		mv.addObject("divid",k);
		
		return mv;
		
	}
	
	
}
