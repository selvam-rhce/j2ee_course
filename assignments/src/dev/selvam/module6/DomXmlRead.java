package dev.selvam.module6;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomXmlRead {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		try {
		File studntInfoFile = new File("src/dev/selvam/module6/student.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document doc = builder.parse(studntInfoFile);
		
//		System.out.println("Root element is "+doc.getDocumentElement().getNodeName());
		
		NodeList nodeList = doc.getElementsByTagName("student");
//		System.out.println(nodeList.getLength());
		System.out.println("********** Read using DOM *************\n");
		for ( int i=0; i < nodeList.getLength(); i++) {
			Student newStudent = new Student();
			Node node = nodeList.item(i);
			Element elmnt = (Element) node;
			String id = elmnt.getElementsByTagName("studentId").item(0).getTextContent();
			String name = elmnt.getElementsByTagName("name").item(0).getTextContent();
			String std = elmnt.getElementsByTagName("std").item(0).getTextContent();
			String gender = elmnt.getElementsByTagName("gender").item(0).getTextContent();
			String mark = elmnt.getElementsByTagName("mark").item(0).getTextContent();
			String address = elmnt.getElementsByTagName("address").item(0).getTextContent();
			
//			System.out.println(
//					"id : "+id+
//					"\nname : "+name+
//					"\nstd : "+std+
//					"\ngender :  "+gender+
//					"\nmark : "+mark+
//					"\naddress : "+address
//					);
//			System.out.println("=================================================");
			newStudent.setId(Integer.parseInt(id));
			newStudent.setName(name);
			newStudent.setStd(Integer.parseInt(std));
			newStudent.setGender(gender);
			newStudent.setMark(Integer.parseInt(mark));
			newStudent.setAddress(address);
			studentList.add(newStudent);

		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(studentList);
		
		

	}

}
