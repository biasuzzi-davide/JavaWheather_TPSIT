import java.io.File;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Forecast.Root;

public class Metodi_Previsioni {
	
	public Metodi_Previsioni() {}
	
	public String Oggi(String Citta) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RichiestaAlServer Server=new RichiestaAlServer();
		String Final="";
		Server.Richiesta(Server.UrlForecast(Citta));
		Root Previsioni=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		
		
	    Final+="City: "+Previsioni.getLocation().getName()+"\n";
	    Final+="Region: "+Previsioni.getLocation().getRegion()+"\n";
	    Final+="Country: "+Previsioni.getLocation().getCountry()+"\n";
	    Final+="Date: "+Previsioni.getLocation().getLocaltime()+"\n";
	    Final+="Temperature: "+Math.round(Previsioni.getCurrent().getTempC()*100.00)/100.00+"\n";
	    Final+="Weather Forecast: "+Previsioni.getCurrent().getCondition().getText()+"\n";
	    Final+="Wind Speed: "+Math.round(Previsioni.getCurrent().getWindKph()*100.00)/100.00+"\n";
	    Final+="Wind Direction: "+Previsioni.getCurrent().getWindDir()+"\n";
	    Final+="Precipitation Millimeters: "+Math.round(Previsioni.getCurrent().getPrecipMm()*100.00)/100.00+"\n";
	    Final+="Humidity: "+Math.round(Previsioni.getCurrent().getHumidity()*100.00)/100.00;
	    
	    
	    return Final;
	}
	
	public ArrayList<String> Futuro(String Citta,int QuantiGiorni, boolean Oggi) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RichiestaAlServer Server=new RichiestaAlServer();
		String Tmp="";
		Server.Richiesta(Server.UrlForecast(Citta));
		Root Previsioni=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		ArrayList<String> Final = new ArrayList<String>();
		
		
	    Tmp+="City: "+Previsioni.getLocation().getName()+"\n";
	    Tmp+="Region: "+Previsioni.getLocation().getRegion()+"\n";
	    Tmp+="Country: "+Previsioni.getLocation().getCountry()+"\n";
	    
	    Final.add(Tmp);
	    Tmp="";
	  
	    
	    for(int i =(Oggi ? 0 : 1);
	    	i<Previsioni.getForecast().getForecastday().size() && i<QuantiGiorni;
	    	i++) {
	    	Tmp+="Date: "+Previsioni.getForecast().getForecastday().get(i).getDate()+"\n";
	    	Tmp+="Maximum Temeratures: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getMaxtempC().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Minimum Temperatures: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getMintempC().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Average Temperatures: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getAvgtempC().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Maximum Wind Speed: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Precipitation Millimeters: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getTotalprecipMm().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Snow Centimeters: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getTotalsnowCm()*100.00)/100.00+"\n";
	    	Tmp+="Visibility Kilometers: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Average Humidity: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Percentage Chance Of Rain: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getDailyChanceOfRain()*100.00)/100.00+"\n";
	    	Tmp+="Percentage Chance Of Snow: "+Math.round(Previsioni.getForecast().getForecastday().get(i).getDay().getDailyChanceOfSnow()*100.00)/100.00+"\n";
	    	Tmp+="Wheater Forecast: "+Previsioni.getForecast().getForecastday().get(i).getDay().getCondition().getText()+"\n\n";
	    	
	    	Final.add(Tmp);
	    	Tmp="";
	    }
	    
	    
	    return Final;
	}

	public String Statistica(String Citta,int QuantiGiorni, boolean Oggi) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RichiestaAlServer Server=new RichiestaAlServer();
		Server.Richiesta(Server.UrlForecast(Citta));
		Root Previsioni=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		double MaxTemp = 0.0;
		double MinTemp = 0.0;
		double AvgTemp = 0.0;
		double MaxSpeWin = 0.0;
		double PreMil = 0.0;
		double SnoCen = 0.0;
		double VisKil = 0.0;
		double AvgHum = 0.0;
		double PerChaRai = 0.0;
		double PerChaSno = 0.0;
		int i;
		
		
		for(i =(Oggi ? 0 : 1);
    	i<Previsioni.getForecast().getForecastday().size() && i<QuantiGiorni;
    	i++) {
			MaxTemp+=Previsioni.getForecast().getForecastday().get(i).getDay().getMaxtempC().doubleValue();
			MinTemp+=Previsioni.getForecast().getForecastday().get(i).getDay().getMintempC().doubleValue();
			AvgTemp+=Previsioni.getForecast().getForecastday().get(i).getDay().getAvgtempC().doubleValue();
			MaxSpeWin+=Previsioni.getForecast().getForecastday().get(i).getDay().getMaxwindKph().doubleValue();
			PreMil+=Previsioni.getForecast().getForecastday().get(i).getDay().getTotalprecipMm().doubleValue();
			SnoCen+=Previsioni.getForecast().getForecastday().get(i).getDay().getTotalsnowCm();
			VisKil+=Previsioni.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue();
			AvgHum+=Previsioni.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue();
			PerChaRai+=Previsioni.getForecast().getForecastday().get(i).getDay().getDailyChanceOfRain();
			PerChaSno+=Previsioni.getForecast().getForecastday().get(i).getDay().getDailyChanceOfSnow();
		}
		
		
		return "Statistics of "+QuantiGiorni+" days: \n"
				+"Average Maximum Temperatures: "+Math.round(MaxTemp/(i-(Oggi ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Minimum Temperatures: "+Math.round(MinTemp/(i-(Oggi ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Temperatures: "+Math.round(AvgTemp/(i-(Oggi ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Maximum Wind Speed: "+Math.round(MaxSpeWin/(i-(Oggi ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Precipitation Millimeters: "+Math.round(PreMil/(i-(Oggi ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Snow Centimers: "+Math.round(SnoCen/(i-(Oggi ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Visibility Kilometers: "+Math.round(VisKil/(i-(Oggi ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Average Humidity: "+Math.round(AvgHum/(i-(Oggi ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Percentage Chance Of Rain: "+Math.round(PerChaRai/(i-(Oggi ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Percentage Chance Of Snow: "+Math.round(PerChaSno/(i-(Oggi ? 0 : 1))*100.00)/100.00
				;
	}
	
}
