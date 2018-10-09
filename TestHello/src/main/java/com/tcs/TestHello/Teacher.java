package com.tcs.TestHello;

public class Teacher {
	private int teacherId;
	private String[] subjects;

	public Teacher(int teacherId, String[] subjects) {
		super();
		this.teacherId = teacherId;
		this.subjects = subjects;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

}
