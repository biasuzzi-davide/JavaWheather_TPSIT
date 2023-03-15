import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;

//Chiave API
//4dcd56b9af624eaaa11132617231503
 
public class Main {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		JAXBContext context = JAXBContext.newInstance(Root.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Root tempo = (Root) unmarshaller.unmarshal(new File("src/ProvaXml.xml"));
        
        System.out.println("Prova: "+tempo.getCurrent().getTempC());
	}

}