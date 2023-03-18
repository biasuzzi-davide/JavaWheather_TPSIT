import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Forecast.Root;

public class Method_Forecast {
	
	public Method_Forecast() {}
	
	public String Today(String city) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		String Final="";
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		
		
	    Final+="City: "+forecast.getLocation().getName()+"\n";
	    Final+="Region: "+forecast.getLocation().getRegion()+"\n";
	    Final+="Country: "+forecast.getLocation().getCountry()+"\n";
	    Final+="Date: "+forecast.getLocation().getLocaltime()+"\n";
	    Final+="Temperature: "+Math.round(forecast.getCurrent().getTempC()*100.00)/100.00+"\n";
	    Final+="Weather Forecast: "+forecast.getCurrent().getCondition().getText()+"\n";
	    Final+="Wind Speed: "+Math.round(forecast.getCurrent().getWindKph()*100.00)/100.00+"\n";
	    Final+="Wind Direction: "+forecast.getCurrent().getWindDir()+"\n";
	    Final+="Precipitation Millimeters: "+Math.round(forecast.getCurrent().getPrecipMm()*100.00)/100.00+"\n";
	    Final+="Humidity: "+Math.round(forecast.getCurrent().getHumidity()*100.00)/100.00;
	    
	    
	    return Final;
	}
	
	public ArrayList<String> Future(String city,int howMuchDay, boolean today) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		String Tmp="";
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		ArrayList<String> Final = new ArrayList<String>();
		
		
	    Tmp+="City: "+forecast.getLocation().getName()+"\n";
	    Tmp+="Region: "+forecast.getLocation().getRegion()+"\n";
	    Tmp+="Country: "+forecast.getLocation().getCountry()+"\n";
	    
	    Final.add(Tmp);
	    Tmp="";
	  
	    
	    for(int i =(today ? 0 : 1);
	    	i<forecast.getForecast().getForecastday().size() && i<howMuchDay;
	    	i++) {
	    	Tmp+="Date: "+forecast.getForecast().getForecastday().get(i).getDate()+"\n";
	    	Tmp+="Maximum Temeratures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxtempC().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Minimum Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMintempC().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Average Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgtempC().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Maximum Wind Speed: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Precipitation Millimeters: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipMm().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Snow Centimeters: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm()*100.00)/100.00+"\n";
	    	Tmp+="Visibility Kilometers: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Average Humidity: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Percentage Chance Of Rain: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfRain()*100.00)/100.00+"\n";
	    	Tmp+="Percentage Chance Of Snow: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfSnow()*100.00)/100.00+"\n";
	    	Tmp+="Wheater Forecast: "+forecast.getForecast().getForecastday().get(i).getDay().getCondition().getText()+"\n\n";
	    	
	    	Final.add(Tmp);
	    	Tmp="";
	    }
	    
	    
	    return Final;
	}

	public String Statistic(String city,int howMuchDay, boolean today) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
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
		
		
		for(i =(today ? 0 : 1);
    	i<forecast.getForecast().getForecastday().size() && i<howMuchDay;
    	i++) {
			MaxTemp+=forecast.getForecast().getForecastday().get(i).getDay().getMaxtempC().doubleValue();
			MinTemp+=forecast.getForecast().getForecastday().get(i).getDay().getMintempC().doubleValue();
			AvgTemp+=forecast.getForecast().getForecastday().get(i).getDay().getAvgtempC().doubleValue();
			MaxSpeWin+=forecast.getForecast().getForecastday().get(i).getDay().getMaxwindKph().doubleValue();
			PreMil+=forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipMm().doubleValue();
			SnoCen+=forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm();
			VisKil+=forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue();
			AvgHum+=forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue();
			PerChaRai+=forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfRain();
			PerChaSno+=forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfSnow();
		}
		
		
		return "Statistics of "+howMuchDay+" days: \n"
				+"Average Maximum Temperatures: "+Math.round(MaxTemp/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Minimum Temperatures: "+Math.round(MinTemp/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Temperatures: "+Math.round(AvgTemp/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Maximum Wind Speed: "+Math.round(MaxSpeWin/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Precipitation Millimeters: "+Math.round(PreMil/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Snow Centimers: "+Math.round(SnoCen/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Visibility Kilometers: "+Math.round(VisKil/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Average Humidity: "+Math.round(AvgHum/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Percentage Chance Of Rain: "+Math.round(PerChaRai/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Percentage Chance Of Snow: "+Math.round(PerChaSno/(i-(today ? 0 : 1))*100.00)/100.00
				;
	}
	
	public String AirToday(String city) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		String Final="";
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		
		
		Final+="City: "+forecast.getLocation().getName()+"\n";
	    Final+="Region: "+forecast.getLocation().getRegion()+"\n";
	    Final+="Country: "+forecast.getLocation().getCountry()+"\n";
	    Final+="Date: "+forecast.getLocation().getLocaltime()+"\n";
	    Final+="Co: "+Math.round(forecast.getCurrent().getAirQuality().getCo().doubleValue()*100.00)/100.00+"\n";
	    Final+="No2: "+Math.round(forecast.getCurrent().getAirQuality().getNo2().doubleValue()*100.00)/100.00+"\n";
	    Final+="O3: "+Math.round(forecast.getCurrent().getAirQuality().getO3().doubleValue()*100.00)/100.00+"\n";
	    Final+="Pm10: "+Math.round(forecast.getCurrent().getAirQuality().getPm10().doubleValue()*100.00)/100.00+"\n";
	    Final+="Pm25: "+Math.round(forecast.getCurrent().getAirQuality().getPm25().doubleValue()*100.00)/100.00+"\n";
	    Final+="So2: "+Math.round(forecast.getCurrent().getAirQuality().getSo2().doubleValue()*100.00)/100.00+"\n";
	    Final+="Gb Defra Index: "+forecast.getCurrent().getAirQuality().getGbDefraIndex()+"\n";
	    Final+="Us Epa Index: "+forecast.getCurrent().getAirQuality().getUsEpaIndex()+"\n";

		
		return Final;
	}
	
	public ArrayList<String> AirFuture(String city,int howMuchDay, boolean today) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		String Tmp="";
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		ArrayList<String> Final = new ArrayList<String>();
		
		
	    Tmp+="City: "+forecast.getLocation().getName()+"\n";
	    Tmp+="Region: "+forecast.getLocation().getRegion()+"\n";
	    Tmp+="Country: "+forecast.getLocation().getCountry()+"\n";
	    
	    Final.add(Tmp);
	    Tmp="";
	  
	    
	    for(int i =(today ? 0 : 1);
	    	i<=4 && i<howMuchDay;
	    	i++) {
	    	Tmp+="Date: "+forecast.getForecast().getForecastday().get(i).getDate()+"\n";
	    	Tmp+="Co: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getCo().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="No2: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getNo2().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="O3: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getO3().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Pm10: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getPm10().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Pm25: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getPm25().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="So2: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getSo2().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Gb Defra Index: "+forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getGbDefraIndex().doubleValue()+"\n";
	    	Tmp+="Us Epa Index: "+forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getUsEpaIndex().doubleValue()+"\n";
	    	
	    	Final.add(Tmp);
	    	Tmp="";
	    }
	    
	    
	    return Final;
	}
	
	public String AirStatistic(String city,int howMuchDay, boolean today) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
		double Co = 0.0;
		double No2 = 0.0;
		double O3 = 0.0;
		double Pm10 = 0.0;
		double Pm25 = 0.0;
		double So2 = 0.0;
		double GbDefraIndex = 0.0;
		double UsEpaIndex = 0.0;
		int i;
		
		
		for(i =(today ? 0 : 1);
    	i<=4 && i<howMuchDay;
    	i++) {
			Co+=forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getCo().doubleValue();
			No2+=forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getNo2().doubleValue();
			O3+=forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getO3().doubleValue();
			Pm10+=forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getPm10().doubleValue();
			Pm25+=forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getPm25().doubleValue();
			So2+=forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getSo2().doubleValue();
			GbDefraIndex+=forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getGbDefraIndex();
			UsEpaIndex+=forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getUsEpaIndex();
		}
		
		
		return "Air Statistics of "+howMuchDay+" days: \n"
				+"Average Co: "+Math.round(Co/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average No2: "+Math.round(No2/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average O3: "+Math.round(O3/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Pm10: "+Math.round(Pm10/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average Pm25: "+Math.round(Pm25/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average So2: "+Math.round(So2/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
				+"Average GbDefraIndex: "+GbDefraIndex/(i-(today ? 0 : 1))+"\n"
				+"Average UsEpaIndex: "+UsEpaIndex/(i-(today ? 0 : 1))
				;
	}
	
}
