package tw.rex.java.spring.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tw.rex.java.spring.service.UserService;


@Controller
@RequestMapping("hello")
public class HelloController {
	
	@Autowired
	private UserService us;
	

	//這裡使用@RequestMapping和RequestMethod
	@RequestMapping(method=RequestMethod.GET)
	public void printHelloSpring(ModelMap model){
		model.addAttribute("user", us.getUsername());
		model.addAttribute("msg", "Hello Spring!");
		model.addAttribute("time", new Date().toString());	
	}
	
	//@RequestMapping(method=RequestMethod.GET)
	public void printHelloWorld(ModelMap model){
		model.addAttribute("user", us.getUsername2());
		model.addAttribute("msg", "Hello Word!");
		model.addAttribute("time", new Date().toString());
	}	
	
	@RequestMapping(method=RequestMethod.POST)
	public void printHelloPost(ModelMap model){
		model.addAttribute("user", us.getUsername2());
		model.addAttribute("msg", "Hello Post!");
		model.addAttribute("time", new Date().toString());
	}	
	
}
