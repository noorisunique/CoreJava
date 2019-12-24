package com.parser;

import java.io.FileInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XMLParserEx {
	protected static String age = "";
	protected static String name = "";

	public static String getStringValue(Element e, String attrName) {
		String result = "";
		NodeList nl = e.getElementsByTagName(attrName);
		if (nl != null && nl.getLength() > 0) {
			result = nl.item(0).getTextContent();

		}
		return result;
	}

	public static void main(String[] args) {
		// create a new DocumentBuilderFactory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			// use the factory to create a documentbuilder
			DocumentBuilder builder = factory.newDocumentBuilder();

			// create a new document from input source
			FileInputStream fis = new FileInputStream("Student.xml");
			InputSource is = new InputSource(fis);
			Document doc = (Document) builder.parse(is);

			// get the first element
			Element element = doc.getDocumentElement();
			age = getStringValue(element, "age");
			name = getStringValue(element, "name");

			System.out.println(age + " " + name);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
