package dataDriven;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Readxml {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\c.samanja09\\eclipse-workspace\\dataDriven\\xmlFiles\\Students.xml");  
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();  
			Document document = documentBuilder.parse(file);  
			System.out.println("Root element: "+ document.getDocumentElement().getNodeName());  
			
		NodeList list=	document.getElementsByTagName(document.getDocumentElement().getNodeName());
		
		for(int i=0; i<list.getLength(); i++) {
			Node n = list.item(i);
			System.out.println(n.getNodeName());
			Element e = (Element)n;
			System.out.println(e.getElementsByTagName(document.getDocumentElement().getNodeName()).item(i).getTextContent());
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
