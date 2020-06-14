package dev.selvam.module6;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxReadXML {

	public static void main(String[] args) {
		Myhandler myHandler = new Myhandler();
		
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			File studentInfoFile = new File("src/dev/selvam/module6/student.xml");
			parser.parse(studentInfoFile, myHandler);
		}
		catch ( Exception e) {
			e.printStackTrace();
		}

	}

}
class Myhandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println("XML Parsing Started...");
	}
	
	public void startElement(String uri, String localname, String qName, Attributes attributes)
	throws SAXException {
		System.out.println("[START] Parsing the tag : "+qName);
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch,start,length);
		System.out.println(data);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("[END] Parsing the tag : "+qName);
	}
	
	public void endDocument() throws SAXException {
		System.out.println("Parsing Finished");
	}
}

