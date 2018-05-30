package edu.dmacc.javaee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class HelloWorld {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>" + "Hello there Folks. This is Spring Speaking</div>";
		return new ModelAndView("welcome", "message", message);
	}
}