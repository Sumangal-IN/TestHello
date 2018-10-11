package com.tcs.TestHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/getStudent/{roll}")
	public Student getStudent(@PathVariable("roll") int roll) {
		return studentService.getStudent(roll);
	}

	@RequestMapping(value = "/saveStudent")
	public void saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
	@RequestMapping(value = "/updateStudent")
	public void updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
	}
	
	@RequestMapping(value = "/removeStudent/{roll}")
	public void removeStudent(@PathVariable("roll") int roll) {
		studentService.removeStudent(roll);
	}

}
