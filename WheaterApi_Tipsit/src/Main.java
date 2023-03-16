import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import Forecast.Root;

import javax.xml.bind.JAXBException;

//Chiave API
//4dcd56b9af624eaaa11132617231503
 
public class Main {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		JAXBContext context = JAXBContext.newInstance(Root.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        RichiestaAlServer Server=new RichiestaAlServer();
        String tmp="";
        Scanner scCitta = new Scanner(System.in);
        while(!tmp.equals("0")) {
        	System.out.println("Inserisci Città");
        	tmp = scCitta.nextLine();
        	if(!tmp.equals("0")) {
        		Server.Richiesta(Server.UrlForecast(tmp));
	        	Root Previsioni=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
	        	System.out.println("Nome Località: "+Previsioni.getLocation().getName());
	        	System.out.println("Paese: "+Previsioni.getLocation().getCountry());
	        	System.out.println("Data: "+Previsioni.getLocation().getLocaltime());
	        	System.out.println("Temperatura: "+Previsioni.getCurrent().getTempC());
	        	System.out.println("Condizioni meteo: "+Previsioni.getCurrent().getCondition().getText());
	        	System.out.println("Velocità Vento: "+Previsioni.getCurrent().getWindKph());
	        	System.out.println("Temperatura di domani alle 16: "+Previsioni.getForecast().getForecastday().get(1).getDate()+" Temp: "+Previsioni.getForecast().getForecastday().get(1).getHour().get(16).getTempC());
        	}
        }
	}

}