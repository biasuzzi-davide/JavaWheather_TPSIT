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

public class XmlFromStringExample {
	private String xmlString = "";
	
	 public XmlFromStringExample(String stringa) throws ParserConfigurationException, SAXException, IOException, TransformerException {
	    xmlString=stringa;  
	    // Crea un'istanza del parser DOM
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder = factory.newDocumentBuilder();
	
	    // Crea un'istanza di InputSource
	    InputSource inputSource = new InputSource(new StringReader(xmlString));
	
	    // Parsa la stringa XML in un oggetto Document
	    Document document = builder.parse(inputSource);
	
	    // Scrivi il contenuto del documento in un file
	    File file = new File("src/ProvaXml.xml");
	    javax.xml.transform.TransformerFactory transformerFactory = javax.xml.transform.TransformerFactory.newInstance();
	    javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
	    javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(document);
	    javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(file);
	    transformer.transform(source, result);
  }
}
