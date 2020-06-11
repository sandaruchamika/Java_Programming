package lk.ac.kln.fct.learn.encapsulation.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Student implements Cloneable {
	private Integer studentID;
	private String name;
	private String degree;
	private HashMap<String,Subject> subjects = new HashMap<>();
	private Double gpa;
	
	public Student(Integer studentID, String name, String degree, HashMap<String, Subject> subjects, Double gpa) {
		this.studentID = studentID;
		this.name = name;
		this.degree = degree;
		this.subjects = subjects;
		this.gpa = gpa;
	}
	
	@Override
	public Student clone() {
		Student student = null;
		HashMap<String, Subject> subjectCopy = new HashMap<String, Subject>();
		try {
			student = (Student) super.clone();
			for(Map.Entry<String, Subject> subject: subjects.entrySet()) {
				subjectCopy.put(subject.getKey(), subject.getValue().clone());
			}
			student.subjects = subjectCopy;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return student;
	}
	
	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public HashMap<String, Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(HashMap<String, Subject> subjects) {
		this.subjects = subjects;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
}
