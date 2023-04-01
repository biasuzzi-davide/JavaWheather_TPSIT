package Forecast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import javax.xml.bind.JAXBException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.DayOfWeek;


public class Method_Forecast {
	
	public Method_Forecast() {}
	
	public ArrayList<HashMap<String, String>> Future(String city,int howMuchDay, boolean today, Boolean AmericanUnit) throws JAXBException {
		Root forecast = Root.getIstance();		
		ArrayList<HashMap<String, String>> Final = new ArrayList<>();
        HashMap<String, String> Tmp = new HashMap<>();

        Tmp.put("city", forecast.getLocation().getName().toString());
	    Tmp.put("region", forecast.getLocation().getRegion());
	    Tmp.put("country", forecast.getLocation().getCountry());
	    Final.add(Tmp);
	    Tmp.clear();
	    
	    for(int i =(today ? 0 : 1);
	    	i<forecast.getForecast().getForecastday().size() && i<howMuchDay;
	    	i++) {
	    	Tmp.put("date", forecast.getForecast().getForecastday().get(i).getDate().toString());
	    	if(AmericanUnit) {
	    		Tmp.put("avgTemp", (Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgtempF().doubleValue()*100.00)/100.00)+"");
	    		Tmp.put("maxWind", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxwindMph().doubleValue()*100.00)/100.00+"");
	    		Tmp.put("avgVis", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisMiles()*100.00)/100.00+"");
		    }else {
		    	Tmp.put("avgTemp", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgtempC().doubleValue()*100.00)/100.00+"");
		    	Tmp.put("maxWind", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"");
		    	Tmp.put("avgVis", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"");
		    }
	    	Tmp.put("avgHum", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvghumidity()*100.00)/100.00+"");
	    	Tmp.put("chaRai", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfRain()*100.00)/100.00+"");
	    	Tmp.put("cond", forecast.getForecast().getForecastday().get(i).getDay().getCondition().getText()+"");
	    	
	    	Final.add(Tmp);
	    	Tmp.clear();;
	    }
	    
	    
	    return Final;
	}
	
	public HashMap<String, String> DayandHour(String city, Boolean AmericanUnit,String date) throws JAXBException {
		Root forecast = Root.getIstance();
        HashMap<String, String> Final = new HashMap<>();
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
	    	Final.put("err", "Day or Hour not valid, Retry.");
	    	return Final;
	    }
	    
	    boolean find3=false;
		boolean find4=false;
	    int r=0;
	    for(r = 0;
	    	r<forecast.getForecast().getForecastday().size();
	    	r++) 
		{
			String[] piecesForecast = forecast.getForecast().getForecastday().get(r).getDate().toString().split(" ");
			if(piecesDate[0].equals(piecesForecast[0]))
			{
				find3=true;
				break;
			}
		}
	    int t=0;
	    if(find3) {
		    for(t = 0;
		    	t<forecast.getForecast().getForecastday().get(r).getHour().size();
		    	t++) 
			{
				String[] piecesForecast = forecast.getForecast().getForecastday().get(r).getHour().get(t).getTime().split(" ");
				String[] pieceForecast = piecesForecast[1].split(":");
				String[] pieceDate = piecesDate[1].split(":");
				if(pieceDate[0].equals(pieceForecast[0]))
				{
					find4=true;
					break;
				}
			}
	    }
	    if(!find3 || !find4) {
	    	Final.put("err", "Day or Hour not valid, Retry.");
	    	return Final;
	    }
	    
	    if(r<2) {
	    	Final.put("Co", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getCo().doubleValue()*100.00)/100.00+"");
	    	Final.put("No2", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getNo2().doubleValue()*100.00)/100.00+"");
	    	Final.put("O3", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getO3().doubleValue()*100.00)/100.00+"");
	    	Final.put("Pm10", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getPm10().doubleValue()*100.00)/100.00+"");
	    	Final.put("Pm25", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getPm25().doubleValue()*100.00)/100.00+"");
	    	Final.put("So2", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getAirQuality().getSo2().doubleValue()*100.00)/100.00+"");
		    
	    }else {
	    	Final.put("err", "we don't have air quality data on this date");
	    	return Final;
	    }
	    
	    Final.put("city", forecast.getLocation().getName());
	    Final.put("region", forecast.getLocation().getRegion());
	    Final.put("country", forecast.getLocation().getCountry());
	    Final.put("date", forecast.getForecast().getForecastday().get(i).getHour().get(j).getTime());
	    if(AmericanUnit) {
	    	Final.put("temp", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getTempF().doubleValue()*100.00)/100.00+"");
	    }else {
	    	Final.put("temp", forecast.getForecast().getForecastday().get(i).getHour().get(j).getTempC()+"");
	    }
	    Final.put("cond", forecast.getForecast().getForecastday().get(i).getHour().get(j).getCondition().getText()+"");
	    if(AmericanUnit) {
	    	Final.put("winSpe", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getWindMph().doubleValue()*100.00)/100.00+"");
	    }else {
	    	Final.put("winSpe", forecast.getForecast().getForecastday().get(i).getHour().get(j).getWindKph()+"");
	    }
	    Final.put("winDir", forecast.getForecast().getForecastday().get(i).getHour().get(j).getWindDir()+"");
	    if(AmericanUnit) {
	    	Final.put("precip", forecast.getForecast().getForecastday().get(i).getHour().get(j).getPrecipIn()+"");
	    }else {
	    	Final.put("precip", forecast.getForecast().getForecastday().get(i).getHour().get(j).getPrecipMm()+"");
	    }
	    Final.put("hum", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getHumidity()*100.00)/100.00+"");
	    Final.put("cloud", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getCloud()*100.00)/100.00+"");
	    if(AmericanUnit) {
	    	Final.put("feeTemp", forecast.getForecast().getForecastday().get(i).getHour().get(j).getFeelslikeF()+"");
	    }else {
	    	Final.put("feeTemp", Math.round(forecast.getForecast().getForecastday().get(i).getHour().get(j).getFeelslikeC().doubleValue()*100.00)/100.00+"");
	    }
	    
	    return Final;
	}

	public HashMap<String, String> Day(String city, Boolean AmericanUnit,String date) throws JAXBException {
		Root forecast = Root.getIstance();
		HashMap<String, String> Final = new HashMap<>();
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
	    if(!find) {
	    	Final.put("err", "Day not valid, Retry.");
	    	return Final;
	    }
	    
		boolean find2=false;
	    
	    int j=0;
	    for(j = 0;
	    	j<forecast.getForecast().getForecastday().size() && j<=2;
	    	j++) 
		{
			String[] piecesForecast = forecast.getForecast().getForecastday().get(j).getDate().toString().split(" ");
			if(piecesDate[0].equals(piecesForecast[0]))
			{
				find2=true;
				break;
			}
		}
	    if(!find2)
	    {
	    	Final.put("err", "Day not valid, Retry.");
	    	return Final;
	    }
	    if(j<=2) {
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getCo().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getNo2().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getO3().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getPm10().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getPm25().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getSo2().doubleValue()*100.00)/100.00+"");
	    }else {
	    	Final.put("err", "we don't have air quality data on this date");
	    	return Final;
	    }
	    
	    Final.put("city", forecast.getLocation().getName());
	    Final.put("region", forecast.getLocation().getRegion());
	    Final.put("country", forecast.getLocation().getCountry());
	    Final.put("date", forecast.getForecast().getForecastday().get(i).getDate().toString());
	    if(AmericanUnit) {
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxtempF().doubleValue()*100.00)/100.00+"");
	    	Final.put("minTemp", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMintempF().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgTemp", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgtempF().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxWin", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxwindMph().doubleValue()*100.00)/100.00+"");
	    	Final.put("precip", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipIn().doubleValue()*100.00)/100.00+"");
	    	Final.put("snow", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm()*100.00)/100.00+"");
	    	Final.put("avgVis", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisMiles()*100.00)/100.00+"");
	    }else {
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxtempC().doubleValue()*100.00)/100.00+"");
	    	Final.put("minTemp", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMintempC().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgTemp", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgtempC().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxWin", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"");
	    	Final.put("precip", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalprecipMm().doubleValue()*100.00)/100.00+"");
	    	Final.put("snow", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getTotalsnowCm()*100.00)/100.00+"");
	    	Final.put("avgVis", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"");
	    }
	    Final.put("hum", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getAvghumidity()*100.00)/100.00+"");
	    Final.put("chaRai", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfRain()*100.00)/100.00+"");
	    Final.put("chaSno", Math.round(forecast.getForecast().getForecastday().get(i).getDay().getDailyChanceOfSnow()*100.00)/100.00+"");
	    Final.put("cond", forecast.getForecast().getForecastday().get(i).getDay().getCondition().getText());
	    
	    return Final;
	}
	
	public HashMap<String, String> Statistic(String city,int howMuchDay, boolean today, Boolean AmericanUnit) throws JAXBException {
		Root forecast = Root.getIstance();
		HashMap<String, String> Final = new HashMap<>();
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
		
		Final.put("city", forecast.getLocation().getName());
	    Final.put("region", forecast.getLocation().getRegion());
	    Final.put("country", forecast.getLocation().getCountry());
		
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
		
		
		double Co = 0.0;
		double No2 = 0.0;
		double O3 = 0.0;
		double Pm10 = 0.0;
		double Pm25 = 0.0;
		double So2 = 0.0;
		int j;
		
		
		for(j =(today ? 0 : 1);
    	j<=2 && j<howMuchDay;
    	j++) {
			Co+=forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getCo().doubleValue();
			No2+=forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getNo2().doubleValue();
			O3+=forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getO3().doubleValue();
			Pm10+=forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getPm10().doubleValue();
			Pm25+=forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getPm25().doubleValue();
			So2+=forecast.getForecast().getForecastday().get(j).getDay().getAirQuality().getSo2().doubleValue();
		}
		
		
		Final.put("day", howMuchDay+"");
		Final.put("day", Math.round(Co/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("day", Math.round(No2/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("day", Math.round(O3/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("day", Math.round(Pm10/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("day", Math.round(Pm25/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("day", Math.round(So2/(i-(today ? 0 : 1))*100.00)/100.00+"");
		
		if(AmericanUnit) {
					
					Final.put("day", howMuchDay+"");
					Final.put("maxTemp", Math.round(MaxTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("minTemp", Math.round(MinTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("avgTemp", Math.round(AvgTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("maxSpeWin", Math.round(MaxSpeWin/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("precip", Math.round(PreMil/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("snow", Math.round(Sno/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("vis", Math.round(Vis/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("avgHum", Math.round(AvgHum/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("chaRai", Math.round(PerChaRai/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("chaSnow", Math.round(PerChaSno/(i-(today ? 0 : 1))*100.00)/100.00+"");
		}else {
					Final.put("day", howMuchDay+"");
					Final.put("maxTemp", Math.round(MaxTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("minTemp", Math.round(MinTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("avgTemp", Math.round(AvgTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("maxSpeWin", Math.round(MaxSpeWin/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("precip", Math.round(PreMil/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("snow", Math.round(Sno/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("vis", Math.round(Vis/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("avgHum", Math.round(AvgHum/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("chaRai", +Math.round(PerChaRai/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("chaSno", Math.round(PerChaSno/(i-(today ? 0 : 1))*100.00)/100.00+"");
		}
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
