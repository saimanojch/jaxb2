package jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int studentId;
	private String studentName;
	private String city;
	private Long phoneNumber;
	private Department department;
	
	@XmlElement(name = "department")
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@XmlElement(name = "id")
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@XmlElement(name = "name")
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@XmlElement(name = "city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@XmlElement(name = "phonenumber")
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Student(int studentId, String studentName, String city, Long phoneNumber, Department department) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.department = department;
	}
	
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", city=" + city + ", phoneNumber="
				+ phoneNumber + ", department=" + department + "]";
	}

}
