package lk.ac.kln.fct.learn.encapsulation.core;

import java.util.ArrayList;
import java.util.Map;

public class Subject implements Cloneable {
	private String subjectID;
	private String subjectName;
	private ArrayList<Degree> allowedDegrees;
	
	public Subject(String subjectID, String subjectName, ArrayList<Degree> allowedDegrees) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.allowedDegrees = allowedDegrees;
	}
	
	@Override
	public Subject clone() {
		Subject subject = null;
		try {
			subject = (Subject) super.clone();
			ArrayList<Degree> allowDegreeCopy = new ArrayList<Degree>();
			for(Degree degree: allowedDegrees) {
				allowDegreeCopy.add(degree.clone());
			}	            
			subject.allowedDegrees = allowDegreeCopy;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return subject;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public ArrayList<Degree> getAllowedDegrees() {
		return allowedDegrees;
	}

	public void setAllowedDegrees(ArrayList<Degree> allowedDegrees) {
		this.allowedDegrees = allowedDegrees;
	}	
}
