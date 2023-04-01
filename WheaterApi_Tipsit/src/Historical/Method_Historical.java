package Historical;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.xml.bind.JAXBException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Method_Historical {
	
	public Method_Historical() {}
	
	public ArrayList<HashMap<String, String>> Past(String city, int howMuchDay, boolean today, Boolean AmericanUnit) throws JAXBException {
		HRoot forecast = HRoot.getIstance();
		forecast=HRoot.refresh(city, forecast.getForecast().getForecastday().getDate().toString());
		ArrayList<HashMap<String, String>> Final = new ArrayList<>();
        HashMap<String, String> Tmp = new HashMap<>();
		
		
        Tmp.put("city", forecast.getLocation().getName().toString());
	    Tmp.put("region", forecast.getLocation().getRegion());
	    Tmp.put("country", forecast.getLocation().getCountry());
	    Final.add(Tmp);
	    Tmp.clear();
	    
	    if(today)
	    {
	    	forecast=HRoot.refresh(city, forecast.getForecast().getForecastday().getDate().getYear()+"-"+forecast.getForecast().getForecastday().getDate().getMonth()+"-"+(forecast.getForecast().getForecastday().getDate().getDay()+1));
	    }
	    
	    for(int i =(today ? 0 : 1);
	    	i<6 && i<howMuchDay;
	    	i++) {
	    	forecast=HRoot.refresh(city, forecast.getForecast().getForecastday().getDate().getYear()+"-"
	    	+(forecast.getForecast().getForecastday().getDate().getMonth()<10 ? "0"+forecast.getForecast().getForecastday().getDate().getMonth() :  forecast.getForecast().getForecastday().getDate().getMonth())+"-"+
	    	(forecast.getForecast().getForecastday().getDate().getDay()-1<10 ? "0"+(forecast.getForecast().getForecastday().getDate().getDay()-1) :  forecast.getForecast().getForecastday().getDate().getDay()-1));
	    	forecast = HRoot.getIstance();
	    	Tmp.put("date", forecast.getForecast().getForecastday().getDate()+"");
	    	if(AmericanUnit) {
	    		Tmp.put("maxTemp", +Math.round(forecast.getForecast().getForecastday().getDay().getMaxtempF().doubleValue()*100.00)/100.00+"");
	    		Tmp.put("minTemp", Math.round(forecast.getForecast().getForecastday().getDay().getMintempF().doubleValue()*100.00)/100.00+"");
	    		Tmp.put("avgTemp", Math.round(forecast.getForecast().getForecastday().getDay().getAvgtempF().doubleValue()*100.00)/100.00+"");
	    		Tmp.put("maxWin", Math.round(forecast.getForecast().getForecastday().getDay().getMaxwindMph().doubleValue()*100.00)/100.00+"");
	    		Tmp.put("precip", Math.round(forecast.getForecast().getForecastday().getDay().getTotalprecipIn().doubleValue()*100.00)/100.00+"");
	    		Tmp.put("avgVis", Math.round(forecast.getForecast().getForecastday().getDay().getAvgvisMiles()*100.00)/100.00+"");
		    }else {
		    	Tmp.put("maxTemp", Math.round(forecast.getForecast().getForecastday().getDay().getMaxtempC().doubleValue()*100.00)/100.00+"");
		    	Tmp.put("minTemp", Math.round(forecast.getForecast().getForecastday().getDay().getMintempC().doubleValue()*100.00)/100.00+"");
		    	Tmp.put("avgTemp", Math.round(forecast.getForecast().getForecastday().getDay().getAvgtempC().doubleValue()*100.00)/100.00+"");
		    	Tmp.put("maxWin", Math.round(forecast.getForecast().getForecastday().getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"");
		    	Tmp.put("precip", Math.round(forecast.getForecast().getForecastday().getDay().getTotalprecipMm().doubleValue()*100.00)/100.00+"");
		    	Tmp.put("avgVis", Math.round(forecast.getForecast().getForecastday().getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"");
		    }
	    	Tmp.put("avgHum", Math.round(forecast.getForecast().getForecastday().getDay().getAvghumidity()*100.00)/100.00+"");
	    	Tmp.put("cond", forecast.getForecast().getForecastday().getDay().getCondition().getText()+"");
	    	
	    	Final.add(Tmp);
	    	Tmp.clear();
	    }
	    
	    
	    return Final;
	}
	
	public HashMap<String, String> PastDayandHour(String city, Boolean AmericanUnit,String date) throws JAXBException, ParseException {
		HRoot forecast = HRoot.getIstance();
		HashMap<String, String> Final = new HashMap<>();
	    String[] piecesDate = date.split(" ");
		boolean find1=true;
		boolean find2=true;
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date tmp = dateFormat.parse(piecesDate[0]);
	    LocalDate data1 = LocalDate.of(forecast.getForecast().getForecastday().getDate().getYear(), forecast.getForecast().getForecastday().getDate().getMonth(), forecast.getForecast().getForecastday().getDate().getDay());
	    LocalDate data2 = LocalDate.of(tmp.getYear(),tmp.getMonth(),tmp.getDay());
	    int between = (int) ChronoUnit.DAYS.between(data1,data2);
	    if(data2.isBefore(data1)) {
		    if(between>6) 
		    {
		    	find1=false;
		    }
	    }else
	    {
	    	find1=false;
	    }
	    int j=0; 
	    if(find1) {
	    	for(j = 0;
			    	j<forecast.getForecast().getForecastday().getHour().size();
			    	j++) 
				{
					String[] piecesForecast = forecast.getForecast().getForecastday().getHour().get(j).getTime().split(" ");
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
	    }else{
	    	forecast = HRoot.refresh(city, date);
	    }
	    
	    Final.put("city", forecast.getLocation().getName().toString());
	    Final.put("region", forecast.getLocation().getRegion());
	    Final.put("country", forecast.getLocation().getCountry());
	    Final.put("date", forecast.getForecast().getForecastday().getHour().get(j).getTime().toString());
	    if(AmericanUnit) {
	    	Final.put("temp", +Math.round(forecast.getForecast().getForecastday().getHour().get(j).getTempF().doubleValue()*100.00)/100.00+"");
	    }else {
	    	Final.put("temp", forecast.getForecast().getForecastday().getHour().get(j).getTempC()+"");
	    }
	    Final.put("cond", forecast.getForecast().getForecastday().getHour().get(j).getCondition().getText()+"");
	    if(AmericanUnit) {
	    	Final.put("winSpee", Math.round(forecast.getForecast().getForecastday().getHour().get(j).getWindMph().doubleValue()*100.00)/100.00+"");
	    }else {
	    	Final.put("winSpee", forecast.getForecast().getForecastday().getHour().get(j).getWindKph()+"");
	    }
	    Final.put("winDir", forecast.getForecast().getForecastday().getHour().get(j).getWindDir()+"");
	    if(AmericanUnit) {
	    	Final.put("precip", forecast.getForecast().getForecastday().getHour().get(j).getPrecipIn()+"");
	    }else {
	    	Final.put("precip", forecast.getForecast().getForecastday().getHour().get(j).getPrecipMm()+"");
	    }
	    Final.put("hum", Math.round(forecast.getForecast().getForecastday().getHour().get(j).getHumidity()*100.00)/100.00+"");
	    Final.put("cloud", Math.round(forecast.getForecast().getForecastday().getHour().get(j).getCloud()*100.00)/100.00+"");
	    if(AmericanUnit) {
	    	Final.put("feeTemp", forecast.getForecast().getForecastday().getHour().get(j).getFeelslikeF()+"");
	    }else {
	    	Final.put("feeTemp", Math.round(forecast.getForecast().getForecastday().getHour().get(j).getFeelslikeC().doubleValue()*100.00)/100.00+"");
	    }
	    
	    return Final;
	}

	public HashMap<String, String> PastDay(String city, Boolean AmericanUnit,String date) throws JAXBException, ParseException {
		HRoot forecast = HRoot.getIstance();
		HashMap<String, String> Final = new HashMap<>();
	    String[] piecesDate = date.split(" ");
		boolean find=false;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date tmp = dateFormat.parse(piecesDate[0]);
	    LocalDate data1 = LocalDate.of(forecast.getForecast().getForecastday().getDate().getYear(), forecast.getForecast().getForecastday().getDate().getMonth(), forecast.getForecast().getForecastday().getDate().getDay());
	    LocalDate data2 = LocalDate.of(tmp.getYear(),tmp.getMonth(),tmp.getDay());
	    int between = (int) ChronoUnit.DAYS.between(data1,data2);
	    if(data2.isBefore(data1)) {
		    if(between>6) 
		    {
		    	find=false;
		    }
	    }else
	    {
	    	find=false;
	    }
	    if(!find) {
	    	Final.put("err", "Day not valid, Retry.");
	    	return Final;
	    }else{
	    	forecast = HRoot.refresh(city, date);
	    }
	    
	    Final.put("city", forecast.getLocation().getName());
	    Final.put("region", forecast.getLocation().getRegion());
	    Final.put("country", forecast.getLocation().getCountry());
	    Final.put("date", forecast.getForecast().getForecastday().getDate().toString());
	    if(AmericanUnit) {
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().getDay().getMaxtempF().doubleValue()*100.00)/100.00+"");
	    	Final.put("minTemp", Math.round(forecast.getForecast().getForecastday().getDay().getMintempF().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgTemp", Math.round(forecast.getForecast().getForecastday().getDay().getAvgtempF().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxWin", Math.round(forecast.getForecast().getForecastday().getDay().getMaxwindMph().doubleValue()*100.00)/100.00+"");
	    	Final.put("precip", Math.round(forecast.getForecast().getForecastday().getDay().getTotalprecipIn().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgVis", Math.round(forecast.getForecast().getForecastday().getDay().getAvgvisMiles()*100.00)/100.00+"");
	    }else {
	    	Final.put("maxTemp", Math.round(forecast.getForecast().getForecastday().getDay().getMaxtempC().doubleValue()*100.00)/100.00+"");
	    	Final.put("minTemp", Math.round(forecast.getForecast().getForecastday().getDay().getMintempC().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgTemp", Math.round(forecast.getForecast().getForecastday().getDay().getAvgtempC().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxWin", Math.round(forecast.getForecast().getForecastday().getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"");
	    	Final.put("precip", Math.round(forecast.getForecast().getForecastday().getDay().getTotalprecipMm().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgVis", Math.round(forecast.getForecast().getForecastday().getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"");
	    }
	    Final.put("avgHum", Math.round(forecast.getForecast().getForecastday().getDay().getAvghumidity()*100.00)/100.00+"");
	    Final.put("cond", forecast.getForecast().getForecastday().getDay().getCondition().getText());
	    
	    return Final;
	}
	
	public HashMap<String, String> PastStatistic(String city,int howMuchDay, boolean today, Boolean AmericanUnit) throws JAXBException {
		HRoot forecast = HRoot.getIstance();
		forecast=HRoot.refresh(city, forecast.getForecast().getForecastday().getDate().toString());
		HashMap<String, String> Final = new HashMap<>();
		double MaxTemp = 0.0;
		double MinTemp = 0.0;
		double AvgTemp = 0.0;
		double MaxSpeWin = 0.0;
		double PreMil = 0.0;
		double Vis = 0.0;
		double AvgHum = 0.0;
		int i;
		
		Final.put("city", forecast.getLocation().getName());
		Final.put("region", forecast.getLocation().getRegion());
		Final.put("country", forecast.getLocation().getCountry());
		Final.put("date", forecast.getForecast().getForecastday().getDate().toString());
		
		for(i =(today ? 0 : 1);
    	i<6 && i<howMuchDay;
    	i++) {
			
			if(AmericanUnit) {
				MaxTemp+=forecast.getForecast().getForecastday().getDay().getMaxtempF().doubleValue();
				MinTemp+=forecast.getForecast().getForecastday().getDay().getMintempF().doubleValue();
				AvgTemp+=forecast.getForecast().getForecastday().getDay().getAvgtempF().doubleValue();
				MaxSpeWin+=forecast.getForecast().getForecastday().getDay().getMaxwindMph().doubleValue();
				PreMil+=forecast.getForecast().getForecastday().getDay().getTotalprecipIn().doubleValue();
				Vis+=forecast.getForecast().getForecastday().getDay().getAvgvisMiles();
		    }else {
		    	MaxTemp+=forecast.getForecast().getForecastday().getDay().getMaxtempC().doubleValue();
				MinTemp+=forecast.getForecast().getForecastday().getDay().getMintempC().doubleValue();
				AvgTemp+=forecast.getForecast().getForecastday().getDay().getAvgtempC().doubleValue();
				MaxSpeWin+=forecast.getForecast().getForecastday().getDay().getMaxwindKph().doubleValue();
				PreMil+=forecast.getForecast().getForecastday().getDay().getTotalprecipMm().doubleValue();
				Vis+=forecast.getForecast().getForecastday().getDay().getAvgvisKm().doubleValue();
		    }
			AvgHum+=forecast.getForecast().getForecastday().getDay().getAvgvisKm().doubleValue();
			forecast=HRoot.refresh(city, forecast.getForecast().getForecastday().getDate().getYear()+"-"+forecast.getForecast().getForecastday().getDate().getMonth()+"-"+(forecast.getForecast().getForecastday().getDate().getDay()-1));
		}
		
		
		if(AmericanUnit) {
					Final.put("day", howMuchDay+"");
					Final.put("maxTemp", Math.round(MaxTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("minTemp", Math.round(MinTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("avgTemp", Math.round(AvgTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("winSpe", Math.round(MaxSpeWin/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("precip", Math.round(PreMil/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("avgVis", Math.round(Vis/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("avgHum", Math.round(AvgHum/(i-(today ? 0 : 1))*100.00)/100.00+"");
		}else {
					Final.put("day", howMuchDay+"");
					Final.put("maxTemp", Math.round(MaxTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("minTemp", Math.round(MinTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("abgTemp", Math.round(AvgTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("winSpe", Math.round(MaxSpeWin/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("precip", Math.round(PreMil/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("avgVis", Math.round(Vis/(i-(today ? 0 : 1))*100.00)/100.00+"");
					Final.put("avgHum", Math.round(AvgHum/(i-(today ? 0 : 1))*100.00)/100.00+"");
		}
		return Final;
	}
	

}