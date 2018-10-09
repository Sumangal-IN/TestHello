package com.tcs.TestHello;

import java.util.List;

public class School {
	private List<Student> students;
	private List<Teacher> teachers;

	public School(List<Student> students, List<Teacher> teachers) {
		super();
		this.students = students;
		this.teachers = teachers;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

}
