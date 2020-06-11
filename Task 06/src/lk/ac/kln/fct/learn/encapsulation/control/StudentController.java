package lk.ac.kln.fct.learn.encapsulation.control;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import lk.ac.kln.fct.learn.encapsulation.core.Student;
import lk.ac.kln.fct.learn.encapsulation.core.Subject;

public class StudentController {
	private static HashMap<Integer, Student> students = new HashMap<>();
	
	public void addStudent(Integer studentID, String name, String degree, HashMap<String,Subject> subjects, Double gpa) {
		Student student = new Student(studentID, name, degree,subjects,gpa);
		students.put(studentID, student);
	}
	
	public HashMap<Integer, Student> getStudents() {
		HashMap<Integer, Student> studentCopy = new HashMap<Integer, Student>();
		for(Map.Entry<Integer, Student> student: students.entrySet()) {
			studentCopy.put(student.getKey(), student.getValue().clone());
		}
		return  studentCopy;
	}
}
