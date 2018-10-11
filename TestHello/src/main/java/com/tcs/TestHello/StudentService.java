package com.tcs.TestHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public Student getStudent(int roll) {
		return studentRepository.findByRoll(roll);
	}

	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	public void updateStudent(Student student) {
		studentRepository.save(student);
	}

	public void removeStudent(int roll) {
		Student student = studentRepository.findByRoll(roll);
		if (student != null)
			studentRepository.delete(student);
	}
}
