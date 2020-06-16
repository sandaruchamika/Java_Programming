package lk.ac.kln.fct.learn.encapsulation.control;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import lk.ac.kln.fct.learn.encapsulation.core.Student;

@SuppressWarnings("serial")
public class StudentController implements Cloneable, Serializable {
	public final HashMap<String, Student> students = new HashMap<>();
	
	public void addNewStudent(Student s) {
		students.put(s.getId(), s);
	}

	@Override
	public StudentController clone() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			return (StudentController)  ois.readObject(); 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
