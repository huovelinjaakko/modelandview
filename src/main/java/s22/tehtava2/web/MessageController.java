package s22.tehtava2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {
	
	@GetMapping("/hello")
	public String greeting(@RequestParam(value="name") String name, 
		@RequestParam (value="ika") String age, 
		Model model) {
		model.addAttribute("name", name);
		model.addAttribute("ika", age);
		return "hello";
	}

}
