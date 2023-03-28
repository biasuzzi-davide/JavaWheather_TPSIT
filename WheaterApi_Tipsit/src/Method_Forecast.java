import java.io.File;
import java.util.ArrayList;
import java.util.Locale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import Forecast.Root;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.DayOfWeek;


public class Method_Forecast {
	
	public Method_Forecast() {}
	
	public String Today(String city, Boolean AmericanUnit) throws JAXBException {
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
	    if(AmericanUnit) {
	    	Final+="Temperature: "+Math.round(forecast.getCurrent().getTempF().doubleValue()*100.00)/100.00+"\n";
	    }else {
	    	Final+="Temperature: "+Math.round(forecast.getCurrent().getTempC()*100.00)/100.00+"\n";
	    }
	    Final+="Weather Forecast: "+forecast.getCurrent().getCondition().getText()+"\n";
	    if(AmericanUnit) {
	    	Final+="Wind Speed: "+Math.round(forecast.getCurrent().getWindMph().doubleValue()*100.00)/100.00+"\n";
	    }else {
	    	Final+="Wind Speed: "+Math.round(forecast.getCurrent().getWindKph()*100.00)/100.00+"\n";
	    }
	    Final+="Wind Direction: "+forecast.getCurrent().getWindDir()+"\n";
	    if(AmericanUnit) {
	    	Final+="Precipitation Millimeters: "+Math.round(forecast.getCurrent().getPrecipIn()*100.00)/100.00+"\n";
	    }else {
	    	Final+="Precipitation Millimeters: "+Math.round(forecast.getCurrent().getPrecipMm()*100.00)/100.00+"\n";
	    }
	    Final+="Humidity: "+Math.round(forecast.getCurrent().getHumidity()*100.00)/100.00+"\n";
	    Final+="Cloud: "+Math.round(forecast.getCurrent().getCloud()*100.00)/100.00+"\n";
	    if(AmericanUnit) {
	    	Final+="Feels Like Temperature: "+Math.round(forecast.getCurrent().getFeelslikeF()*100.00)/100.00+"\n";
	    }else {
	    	Final+="Feels Like Temperature: "+Math.round(forecast.getCurrent().getFeelslikeC().doubleValue()*100.00)/100.00+"\n";
	    }
	    
	    return Final;
	}
	
	public ArrayList<String> Future(String city,int howMuchDay, boolean today, Boolean AmericanUnit) throws JAXBException {
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
	    	if(AmericanUnit) {
	    		Tmp+="Maximum Temeratures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxtempF().doubleValue()*100.00)/100.00+"\n";
	    		Tmp+="Minimum Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMintempF().doubleValue()*100.00)/100.00+"\n";
	    		Tmp+="Average Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgtempF().doubleValue()*100.00)/100.00+"\n";
	    		Tmp+="Maximum Wind Speed: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxwindMph().doubleValue()*100.00)/100.00+"\n";
	    		Tmp+="Precipitation Inch: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipIn().doubleValue()*100.00)/100.00+"\n";
		    	Tmp+="Snow Centimeters: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm()*100.00)/100.00+"\n";
		    	Tmp+="Visibility Miles: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisMiles()*100.00)/100.00+"\n";
		    }else {
		    	Tmp+="Maximum Temeratures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxtempC().doubleValue()*100.00)/100.00+"\n";
		    	Tmp+="Minimum Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMintempC().doubleValue()*100.00)/100.00+"\n";
		    	Tmp+="Average Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgtempC().doubleValue()*100.00)/100.00+"\n";
		    	Tmp+="Maximum Wind Speed: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"\n";
		    	Tmp+="Precipitation Millimeters: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipMm().doubleValue()*100.00)/100.00+"\n";
		    	Tmp+="Snow Centimeters: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm()*100.00)/100.00+"\n";
		    	Tmp+="Visibility Kilometers: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"\n";
		    }
	    	Tmp+="Average Humidity: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"\n";
	    	Tmp+="Percentage Chance Of Rain: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfRain()*100.00)/100.00+"\n";
	    	Tmp+="Percentage Chance Of Snow: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfSnow()*100.00)/100.00+"\n";
	    	Tmp+="Wheater Forecast: "+forecast.getForecast().getForecastday().get(i).getDay().getCondition().getText()+"\n\n";
	    	
	    	Final.add(Tmp);
	    	Tmp="";
	    }
	    
	    
	    return Final;
	}
	
	public String DayandHour(String city, Boolean AmericanUnit,String date) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		String Final="";
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
	    String[] piecesDate = date.split(" ");
		boolean find1=false;
		boolean find2=false;
	    int i=0;
	    for(i = 0;
	    	i<forecast.getForecast().getForecastday().size();
	    	i++) 
		{
			String[] piecesForecast = forecast.getForecast().getForecastday().get(i).getDate().toString().split(" ");
			if(piecesDate[0].equals(piecesForecast[0]))
			{
				find1=true;
				break;
			}
		}
	    int j=0;
	    if(find1) {
		    for(j = 0;
		    	j<forecast.getForecast().getForecastday().get(i).getHour().size();
		    	j++) 
			{
				String[] piecesForecast = forecast.getForecast().getForecastday().get(i).getHour().get(j).getTime().split(" ");
				String[] pieceForecast = piecesForecast[1].split(":");
				String[] pieceDate = piecesDate[1].split(":");
				if(pieceDate[0].equals(pieceForecast[0]))
				{
					find2=true;
					break;
				}
			}
	    }
	    if(!find1 || !find2) {
	    	return "Day or Hour not valid, Retry.";
	    }
	    
	    Final+="City: "+forecast.getLocation().getName()+"\n";
	    Final+="Region: "+forecast.getLocation().getRegion()+"\n";
	    Final+="Country: "+forecast.getLocation().getCountry()+"\n";
	    Final+="Date: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getTime()+"\n";
	    if(AmericanUnit) {
	    	Final+="Temperature: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getTempF().doubleValue()*100.00)/100.00+"\n";
	    }else {
	    	Final+="Temperature: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getTempC()+"\n";
	    }
	    Final+="Weather Forecast: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getCondition().getText()+"\n";
	    if(AmericanUnit) {
	    	Final+="Wind Speed: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getWindMph().doubleValue()*100.00)/100.00+"\n";
	    }else {
	    	Final+="Wind Speed: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getWindKph()+"\n";
	    }
	    Final+="Wind Direction: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getWindDir()+"\n";
	    if(AmericanUnit) {
	    	Final+="Precipitation Millimeters: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getPrecipIn()+"\n";
	    }else {
	    	Final+="Precipitation Millimeters: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getPrecipMm()+"\n";
	    }
	    Final+="Humidity: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getHumidity()*100.00)/100.00+"\n";
	    Final+="Cloud: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getCloud()*100.00)/100.00+"\n";
	    if(AmericanUnit) {
	    	Final+="Feels Like Temperature: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getFeelslikeF()+"\n";
	    }else {
	    	Final+="Feels Like Temperature: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getFeelslikeC().doubleValue()*100.00)/100.00+"\n";
	    }
	    
	    return Final;
	}

	public String Day(String city, Boolean AmericanUnit,String date) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		String Final="";
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
	    String[] piecesDate = date.split(" ");
		boolean find=false;
	    
	    int i=0;
	    for(i = 0;
	    	i<forecast.getForecast().getForecastday().size();
	    	i++) 
		{
			String[] piecesForecast = forecast.getForecast().getForecastday().get(i).getDate().toString().split(" ");
			if(piecesDate[0].equals(piecesForecast[0]))
			{
				find=true;
				break;
			}
		}
	    if(!find)
	    	return "Day not valid, Retry.";
	    
	    Final+="City: "+forecast.getLocation().getName()+"\n";
	    Final+="Region: "+forecast.getLocation().getRegion()+"\n";
	    Final+="Country: "+forecast.getLocation().getCountry()+"\n";
	    Final+="Date: "+forecast.getForecast().getForecastday().get(i).getDate()+"\n";
	    if(AmericanUnit) {
    		Final+="Maximum Temeratures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxtempF().doubleValue()*100.00)/100.00+"\n";
    		Final+="Minimum Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMintempF().doubleValue()*100.00)/100.00+"\n";
    		Final+="Average Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgtempF().doubleValue()*100.00)/100.00+"\n";
    		Final+="Maximum Wind Speed: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxwindMph().doubleValue()*100.00)/100.00+"\n";
    		Final+="Precipitation Inch: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipIn().doubleValue()*100.00)/100.00+"\n";
	    	Final+="Snow Centimeters: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm()*100.00)/100.00+"\n";
	    	Final+="Visibility Miles: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisMiles()*100.00)/100.00+"\n";
	    }else {
	    	Final+="Maximum Temeratures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxtempC().doubleValue()*100.00)/100.00+"\n";
	    	Final+="Minimum Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMintempC().doubleValue()*100.00)/100.00+"\n";
	    	Final+="Average Temperatures: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgtempC().doubleValue()*100.00)/100.00+"\n";
	    	Final+="Maximum Wind Speed: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"\n";
	    	Final+="Precipitation Millimeters: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipMm().doubleValue()*100.00)/100.00+"\n";
	    	Final+="Snow Centimeters: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm()*100.00)/100.00+"\n";
	    	Final+="Visibility Kilometers: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"\n";
	    }
    	Final+="Average Humidity: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"\n";
    	Final+="Percentage Chance Of Rain: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfRain()*100.00)/100.00+"\n";
    	Final+="Percentage Chance Of Snow: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfSnow()*100.00)/100.00+"\n";
    	Final+="Wheater Forecast: "+forecast.getForecast().getForecastday().get(i).getDay().getCondition().getText();
	    
	    return Final;
	}
	
	public String Statistic(String city,int howMuchDay, boolean today, Boolean AmericanUnit) throws JAXBException {
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
		double Sno = 0.0;
		double Vis = 0.0;
		double AvgHum = 0.0;
		double PerChaRai = 0.0;
		double PerChaSno = 0.0;
		int i;
		
		
		for(i =(today ? 0 : 1);
    	i<forecast.getForecast().getForecastday().size() && i<howMuchDay;
    	i++) {
			if(AmericanUnit) {
				MaxTemp+=forecast.getForecast().getForecastday().get(i).getDay().getMaxtempF().doubleValue();
				MinTemp+=forecast.getForecast().getForecastday().get(i).getDay().getMintempF().doubleValue();
				AvgTemp+=forecast.getForecast().getForecastday().get(i).getDay().getAvgtempF().doubleValue();
				MaxSpeWin+=forecast.getForecast().getForecastday().get(i).getDay().getMaxwindMph().doubleValue();
				PreMil+=forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipIn().doubleValue();
				Sno+=forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm();
				Vis+=forecast.getForecast().getForecastday().get(i).getDay().getAvgvisMiles();
		    }else {
		    	MaxTemp+=forecast.getForecast().getForecastday().get(i).getDay().getMaxtempC().doubleValue();
				MinTemp+=forecast.getForecast().getForecastday().get(i).getDay().getMintempC().doubleValue();
				AvgTemp+=forecast.getForecast().getForecastday().get(i).getDay().getAvgtempC().doubleValue();
				MaxSpeWin+=forecast.getForecast().getForecastday().get(i).getDay().getMaxwindKph().doubleValue();
				PreMil+=forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipMm().doubleValue();
				Sno+=forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm();
				Vis+=forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue();
		    }
			AvgHum+=forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue();
			PerChaRai+=forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfRain();
			PerChaSno+=forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfSnow();
		}
		
		
		if(AmericanUnit) {
			return "Statistics of "+howMuchDay+" days: \n"
					+"Average Maximum Temperatures: "+Math.round(MaxTemp/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Minimum Temperatures: "+Math.round(MinTemp/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Temperatures: "+Math.round(AvgTemp/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Maximum Wind Speed: "+Math.round(MaxSpeWin/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Precipitation Inch: "+Math.round(PreMil/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Snow Centimers: "+Math.round(Sno/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Visibility Miles: "+Math.round(Vis/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Average Humidity: "+Math.round(AvgHum/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Percentage Chance Of Rain: "+Math.round(PerChaRai/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Percentage Chance Of Snow: "+Math.round(PerChaSno/(i-(today ? 0 : 1))*100.00)/100.00
					;
		}else {
			return "Statistics of "+howMuchDay+" days: \n"
					+"Average Maximum Temperatures: "+Math.round(MaxTemp/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Minimum Temperatures: "+Math.round(MinTemp/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Temperatures: "+Math.round(AvgTemp/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Maximum Wind Speed: "+Math.round(MaxSpeWin/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Precipitation Millimeters: "+Math.round(PreMil/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Snow Centimers: "+Math.round(Sno/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Visibility Kilometers: "+Math.round(Vis/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Average Humidity: "+Math.round(AvgHum/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Percentage Chance Of Rain: "+Math.round(PerChaRai/(i-(today ? 0 : 1))*100.00)/100.00+"\n"
					+"Average Percentage Chance Of Snow: "+Math.round(PerChaSno/(i-(today ? 0 : 1))*100.00)/100.00
					;
		}
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
	    	i<=3 && i<howMuchDay;
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
    	i<=3 && i<howMuchDay;
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
	
	public String AirDayandHour(String city, Boolean AmericanUnit,String date) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		String Final="";
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
	    String[] piecesDate = date.split(" ");
		boolean find1=false;
		boolean find2=false;
	    int i=0;
	    for(i = 0;
	    	i<forecast.getForecast().getForecastday().size();
	    	i++) 
		{
			String[] piecesForecast = forecast.getForecast().getForecastday().get(i).getDate().toString().split(" ");
			if(piecesDate[0].equals(piecesForecast[0]))
			{
				find1=true;
				break;
			}
		}
	    int j=0;
	    if(find1) {
		    for(j = 0;
		    	j<forecast.getForecast().getForecastday().get(i).getHour().size();
		    	j++) 
			{
				String[] piecesForecast = forecast.getForecast().getForecastday().get(i).getHour().get(j).getTime().split(" ");
				String[] pieceForecast = piecesForecast[1].split(":");
				String[] pieceDate = piecesDate[1].split(":");
				if(pieceDate[0].equals(pieceForecast[0]))
				{
					find2=true;
					break;
				}
			}
	    }
	    if(!find1 || !find2) {
	    	return "Day or Hour not valid, Retry.";
	    }
	    
	    Final+="City: "+forecast.getLocation().getName()+"\n";
	    Final+="Region: "+forecast.getLocation().getRegion()+"\n";
	    Final+="Country: "+forecast.getLocation().getCountry()+"\n";
	    Final+="Date: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getTime()+"\n";
	    Final+="Co: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getCo().doubleValue()*100.00)/100.00+"\n";
	    Final+="No2: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getNo2().doubleValue()*100.00)/100.00+"\n";
	    Final+="O3: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getO3().doubleValue()*100.00)/100.00+"\n";
	    Final+="Pm10: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getPm10().doubleValue()*100.00)/100.00+"\n";
	    Final+="Pm25: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getPm25().doubleValue()*100.00)/100.00+"\n";
	    Final+="So2: "+Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getSo2().doubleValue()*100.00)/100.00+"\n";
	    Final+="Gb Defra Index: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getGbDefraIndex()+"\n";
	    Final+="Us Epa Index: "+forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getUsEpaIndex()+"\n";
	    
	    return Final;
	}

	public String AirDay(String city, Boolean AmericanUnit,String date) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Root.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    RequestToServer Server=new RequestToServer();
		String Final="";
		Server.Request(Server.UrlForecast(city));
		Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
	    String[] piecesDate = date.split(" ");
		boolean find=false;
	    
	    int i=0;
	    for(i = 0;
	    	i<forecast.getForecast().getForecastday().size();
	    	i++) 
		{
			String[] piecesForecast = forecast.getForecast().getForecastday().get(i).getDate().toString().split(" ");
			if(piecesDate[0].equals(piecesForecast[0]))
			{
				find=true;
				break;
			}
		}
	    if(!find)
	    	return "Day not valid, Retry.";
	    
	    Final+="City: "+forecast.getLocation().getName()+"\n";
	    Final+="Region: "+forecast.getLocation().getRegion()+"\n";
	    Final+="Country: "+forecast.getLocation().getCountry()+"\n";
	    Final+="Date: "+forecast.getForecast().getForecastday().get(i).getDate()+"\n";
	    Final+="Co: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getCo().doubleValue()*100.00)/100.00+"\n";
	    Final+="No2: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getNo2().doubleValue()*100.00)/100.00+"\n";
	    Final+="O3: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getO3().doubleValue()*100.00)/100.00+"\n";
	    Final+="Pm10: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getPm10().doubleValue()*100.00)/100.00+"\n";
	    Final+="Pm25: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getPm25().doubleValue()*100.00)/100.00+"\n";
	    Final+="So2: "+Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getSo2().doubleValue()*100.00)/100.00+"\n";
	    Final+="Gb Defra Index: "+forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getGbDefraIndex()+"\n";
	    Final+="Us Epa Index: "+forecast.getForecast().getForecastday().get(i).getDay().getAirQuality().getUsEpaIndex()+"\n";
	    
	    return Final;
	}	
	
	public String FindDayOfWeek(String date,boolean localtime) {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    LocalDate localDate;
	    if(localtime) {
	    	String[] pieces = date.split(" ");
	    	localDate = LocalDate.parse(pieces[0], formatter);
	    }else {
	    	localDate = LocalDate.parse(date, formatter);
	    }
	    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
	    return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
	}
	
}
