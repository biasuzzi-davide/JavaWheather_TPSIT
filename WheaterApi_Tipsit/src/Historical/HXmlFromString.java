package Historical;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class HXmlFromString {
	private String xmlString = "";
	
	 public HXmlFromString(String string) throws ParserConfigurationException, SAXException, IOException, TransformerException {
	    xmlString=string;  
	    // Create instance of parser DOM
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder = factory.newDocumentBuilder();
	
	    // Create instance of InputSource
	    InputSource inputSource = new InputSource(new StringReader(xmlString));
	
	    // Parse the String XML in a object in a file
	    Document document = builder.parse(inputSource);
	
	    // Write the content of the document in a file
	    File file = new File("src/Historical/Historical.xml");
	    javax.xml.transform.TransformerFactory transformerFactory = javax.xml.transform.TransformerFactory.newInstance();
	    javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
	    javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(document);
	    javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(file);
	    transformer.transform(source, result);
 }
}
