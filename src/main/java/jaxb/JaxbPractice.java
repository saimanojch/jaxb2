package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbPractice {

	public static void main(String[] args) {
		try {
			JaxbPractice.marshalling();
			JaxbPractice.unmarshalling();
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void marshalling() throws JAXBException {
		
		Department department = new Department(2, "ECE");
		Student student = new Student(1, "Sai Manoj", "Bapatla", 7000000000L, department);
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(student, System.out);
		marshaller.marshal(student, new File("src\\main\\resources\\student.xml"));
	}
	
	public static void unmarshalling() throws JAXBException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		Student student = (Student) unmarshaller.unmarshal(new File("src\\main\\resources\\student.xml"));
		System.out.println(student);
	}

}
