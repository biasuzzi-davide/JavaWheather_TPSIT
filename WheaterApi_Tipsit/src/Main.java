import java.io.File;
import java.util.Scanner;

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
        Prova prova=new Prova();
        String tmp="";
        String citta="";
        Scanner scCitta = new Scanner(System.in);
        while(!tmp.equals("0")) {
        	System.out.println("Inserisci Città");
        	tmp = scCitta.nextLine();
        	if(!tmp.equals("0")) {
        		prova.Richiesta(prova.Url(tmp));
	        	Root tempo=(Root) unmarshaller.unmarshal(new File("src/ProvaXml.xml"));
	        	System.out.println("Nome Località: "+tempo.getLocation().getName());
	        	System.out.println("Paese: "+tempo.getLocation().getCountry());
	        	System.out.println("Data: "+tempo.getLocation().getLocaltime());
	        	System.out.println("Temperatura: "+tempo.getCurrent().getTempC());
	        	System.out.println("Condizioni meteo: "+tempo.getCurrent().getCondition().getText());
	        	System.out.println("Velocità Vento: "+tempo.getCurrent().getWindKph());
        	}
        }
	}

}