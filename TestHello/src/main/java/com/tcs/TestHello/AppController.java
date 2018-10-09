package com.tcs.TestHello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping(value = "/testStudent/{roll}/{class}")
	public Student testStudent(@PathVariable("roll") int roll, @PathVariable("class") String cls) {
		return new Student(roll, "aaa", "kolkata");
	}

	@RequestMapping(value = "/testTeacher")
	public Teacher testTeacher() {
		return new Teacher(100, new String[] { "math", "phy", "che" });
	}

	@RequestMapping(value = "/testSchool")
	public School testSchool() {
		List<Student> students = new ArrayList<>();
		List<Teacher> teachers = new ArrayList<>();

		students.add(new Student(10, "aaa", "kolkata"));
		students.add(new Student(11, "bbb", "delhi"));
		students.add(new Student(12, "ccc", "mumbai"));
		students.add(new Student(13, "ddd", "chennai"));

		teachers.add(new Teacher(100, new String[] { "math", "phy", "che" }));
		teachers.add(new Teacher(100, new String[] { "his", "geo", "pol sc" }));

		return new School(students, teachers);
	}

}
