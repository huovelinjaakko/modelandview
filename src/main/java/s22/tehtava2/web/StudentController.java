package s22.tehtava2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s22.tehtava2.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("opiskelijat")
	public String showStudents(Model model) {
		
		ArrayList<Student> opiskelijat = new ArrayList<>();
		
		opiskelijat.add(new Student("Toni", "Virtanen"));
		opiskelijat.add(new Student("Sipe", "Santapukki"));
		opiskelijat.add(new Student("Ville", "Mäkinen"));
		
		model.addAttribute("studentList", opiskelijat);
		
		return "students";
	}
}
