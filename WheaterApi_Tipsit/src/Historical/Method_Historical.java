package Historical;

import java.util.Date;
import java.util.HashMap;

import javax.xml.bind.JAXBException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Method_Historical {
	
	public static HashMap<String, String> Past(String city, int howMuchDay, boolean today, Boolean AmericanUnit) throws JAXBException {
		LocalDate TODAY = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String dateFormatted = TODAY.format(formatter);
		HRoot historical=HRoot.refresh(city, dateFormatted);
        HashMap<String, String> Final = new HashMap<>();
		
        Final.put("city", historical.getLocation().getName().toString());
	    Final.put("region", historical.getLocation().getRegion());
	    Final.put("country", historical.getLocation().getCountry());
	    
	    if(!today)
	    {
	    	LocalDate dateModify = LocalDate.parse(historical.getForecast().getForecastday().getDate().toString() , DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        LocalDate dateModified = dateModify.minusDays(1);
	        dateModified.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        historical=HRoot.refresh(city, dateModified.toString());
	    }
	    
	    for(int i =(today ? 0 : 1);
	    	i<6 && i<howMuchDay;
	    	i++) {
	    	Final.put("date"+i, historical.getForecast().getForecastday().getDate()+"");
	    	if(AmericanUnit) {
	    		Final.put("maxTemp"+i, +Math.round(historical.getForecast().getForecastday().getDay().getMaxtempF().doubleValue()*100.00)/100.00+"");
	    		Final.put("minTemp"+i, Math.round(historical.getForecast().getForecastday().getDay().getMintempF().doubleValue()*100.00)/100.00+"");
	    		Final.put("avgTemp"+i, Math.round(historical.getForecast().getForecastday().getDay().getAvgtempF().doubleValue()*100.00)/100.00+"");
	    		Final.put("maxWin"+i, Math.round(historical.getForecast().getForecastday().getDay().getMaxwindMph().doubleValue()*100.00)/100.00+"");
	    		Final.put("precip"+i, Math.round(historical.getForecast().getForecastday().getDay().getTotalprecipIn().doubleValue()*100.00)/100.00+"");
	    		Final.put("avgVis"+i, Math.round(historical.getForecast().getForecastday().getDay().getAvgvisMiles()*100.00)/100.00+"");
		    }else {
		    	Final.put("maxTemp"+i, Math.round(historical.getForecast().getForecastday().getDay().getMaxtempC().doubleValue()*100.00)/100.00+"");
		    	Final.put("minTemp"+i, Math.round(historical.getForecast().getForecastday().getDay().getMintempC().doubleValue()*100.00)/100.00+"");
		    	Final.put("avgTemp"+i, Math.round(historical.getForecast().getForecastday().getDay().getAvgtempC().doubleValue()*100.00)/100.00+"");
		    	Final.put("maxWin"+i, Math.round(historical.getForecast().getForecastday().getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"");
		    	Final.put("precip"+i, Math.round(historical.getForecast().getForecastday().getDay().getTotalprecipMm().doubleValue()*100.00)/100.00+"");
		    	Final.put("avgVis"+i, Math.round(historical.getForecast().getForecastday().getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"");
		    }
	    	Final.put("avgHum"+i, Math.round(historical.getForecast().getForecastday().getDay().getAvghumidity()*100.00)/100.00+"");
	    	Final.put("cond"+i, historical.getForecast().getForecastday().getDay().getCondition().getText()+"");
	    	Final.put("icon"+i, historical.getForecast().getForecastday().getDay().getCondition().getIcon()+"");
	    	LocalDate dateModify = LocalDate.parse(historical.getForecast().getForecastday().getDate().toString() , DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        LocalDate dateModified = dateModify.minusDays(1);
	        dateModified.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        historical=HRoot.refresh(city, dateModified.toString());
	    }
	    
	    
	    return Final;
	}
	
	public static HashMap<String, String> PastDayandHour(String city, Boolean AmericanUnit,String date) throws JAXBException, ParseException {
		LocalDate TODAY = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String dateFormatted = TODAY.format(formatter);
		HRoot historical=HRoot.refresh(city, dateFormatted);
		HashMap<String, String> Final = new HashMap<>();
		boolean find1=true;
		boolean find2=true;
		String[] piecesDate = date.split(" ");
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    Date tmp = dateFormat.parse(piecesDate[0]);
	    LocalDate data1 = LocalDate.of(historical.getForecast().getForecastday().getDate().getYear(), historical.getForecast().getForecastday().getDate().getMonth(), historical.getForecast().getForecastday().getDate().getDay());
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
			    	j<historical.getForecast().getForecastday().getHour().size();
			    	j++) 
				{
					String[] piecesForecast = historical.getForecast().getForecastday().getHour().get(j).getTime().split(" ");
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
	    	historical = HRoot.refresh(city, piecesDate[0]);
	    }
	    
	    Final.put("city", historical.getLocation().getName().toString());
	    Final.put("region", historical.getLocation().getRegion());
	    Final.put("country", historical.getLocation().getCountry());
	    Final.put("date", historical.getForecast().getForecastday().getHour().get(j).getTime().toString());
	    if(AmericanUnit) {
	    	Final.put("temp", +Math.round(historical.getForecast().getForecastday().getHour().get(j).getTempF().doubleValue()*100.00)/100.00+"");
	    }else {
	    	Final.put("temp", historical.getForecast().getForecastday().getHour().get(j).getTempC()+"");
	    }
	    Final.put("cond", historical.getForecast().getForecastday().getHour().get(j).getCondition().getText()+"");
	    Final.put("icon", historical.getForecast().getForecastday().getHour().get(j).getCondition().getIcon()+"");
	    if(AmericanUnit) {
	    	Final.put("winSpee", Math.round(historical.getForecast().getForecastday().getHour().get(j).getWindMph().doubleValue()*100.00)/100.00+"");
	    }else {
	    	Final.put("winSpee", historical.getForecast().getForecastday().getHour().get(j).getWindKph()+"");
	    }
	    Final.put("winDir", historical.getForecast().getForecastday().getHour().get(j).getWindDir()+"");
	    if(AmericanUnit) {
	    	Final.put("precip", historical.getForecast().getForecastday().getHour().get(j).getPrecipIn()+"");
	    }else {
	    	Final.put("precip", historical.getForecast().getForecastday().getHour().get(j).getPrecipMm()+"");
	    }
	    Final.put("hum", Math.round(historical.getForecast().getForecastday().getHour().get(j).getHumidity()*100.00)/100.00+"");
	    Final.put("cloud", Math.round(historical.getForecast().getForecastday().getHour().get(j).getCloud()*100.00)/100.00+"");
	    if(AmericanUnit) {
	    	Final.put("feeTemp", historical.getForecast().getForecastday().getHour().get(j).getFeelslikeF()+"");
	    }else {
	    	Final.put("feeTemp", Math.round(historical.getForecast().getForecastday().getHour().get(j).getFeelslikeC().doubleValue()*100.00)/100.00+"");
	    }
	    
	    return Final;
	}

	public static HashMap<String, String> PastDay(String city, Boolean AmericanUnit,String date) throws JAXBException, ParseException {
		LocalDate TODAY = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String dateFormatted = TODAY.format(formatter);
		HRoot historical=HRoot.refresh(city, dateFormatted);
		HashMap<String, String> Final = new HashMap<>();
		boolean find=true;
		String[] piecesDate = date.split(" ");
		String[] piecesDate2 = piecesDate[0].split("-");
	    LocalDate date1 = LocalDate.of(historical.getForecast().getForecastday().getDate().getYear(), historical.getForecast().getForecastday().getDate().getMonth(), historical.getForecast().getForecastday().getDate().getDay());
	    LocalDate date2 = LocalDate.of(Integer.parseInt(piecesDate2[0]), Integer.parseInt(piecesDate2[1]), Integer.parseInt(piecesDate2[2]));
	    LocalDate dateNow= LocalDate.of(TODAY.getYear(), TODAY.getMonth(), TODAY.getDayOfMonth());
	    int between = (int) ChronoUnit.DAYS.between(date1,date2);
	    if(date2.isBefore(date1) || date2.isEqual(dateNow)) {
		    if(between>6) 
		    {
		    	System.out.println("ciao");
		    	find=false;
		    }
	    }else
	    {
	    	System.out.println("ciao2");
	    	find=false;
	    }
	    if(!find) {
	    	Final.put("err", "Day not valid, Retry.");
	    	return Final;
	    }else{
	    	historical = HRoot.refresh(city, piecesDate[0]);
	    }
	    
	    Final.put("city", historical.getLocation().getName());
	    Final.put("region", historical.getLocation().getRegion());
	    Final.put("country", historical.getLocation().getCountry());
	    Final.put("date", historical.getForecast().getForecastday().getDate().toString());
	    if(AmericanUnit) {
	    	Final.put("maxTemp", Math.round(historical.getForecast().getForecastday().getDay().getMaxtempF().doubleValue()*100.00)/100.00+"");
	    	Final.put("minTemp", Math.round(historical.getForecast().getForecastday().getDay().getMintempF().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgTemp", Math.round(historical.getForecast().getForecastday().getDay().getAvgtempF().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxWin", Math.round(historical.getForecast().getForecastday().getDay().getMaxwindMph().doubleValue()*100.00)/100.00+"");
	    	Final.put("precip", Math.round(historical.getForecast().getForecastday().getDay().getTotalprecipIn().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgVis", Math.round(historical.getForecast().getForecastday().getDay().getAvgvisMiles()*100.00)/100.00+"");
	    }else {
	    	Final.put("maxTemp", Math.round(historical.getForecast().getForecastday().getDay().getMaxtempC().doubleValue()*100.00)/100.00+"");
	    	Final.put("minTemp", Math.round(historical.getForecast().getForecastday().getDay().getMintempC().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgTemp", Math.round(historical.getForecast().getForecastday().getDay().getAvgtempC().doubleValue()*100.00)/100.00+"");
	    	Final.put("maxWin", Math.round(historical.getForecast().getForecastday().getDay().getMaxwindKph().doubleValue()*100.00)/100.00+"");
	    	Final.put("precip", Math.round(historical.getForecast().getForecastday().getDay().getTotalprecipMm().doubleValue()*100.00)/100.00+"");
	    	Final.put("avgVis", Math.round(historical.getForecast().getForecastday().getDay().getAvgvisKm().doubleValue()*100.00)/100.00+"");
	    }
	    Final.put("avgHum", Math.round(historical.getForecast().getForecastday().getDay().getAvghumidity()*100.00)/100.00+"");
	    Final.put("cond", historical.getForecast().getForecastday().getDay().getCondition().getText());
	    Final.put("icon", historical.getForecast().getForecastday().getDay().getCondition().getIcon()+"");
	    
	    return Final;
	}
	
	public static HashMap<String, String> PastStatistic(String city,int howMuchDay, boolean today, Boolean AmericanUnit) throws JAXBException {
		LocalDate TODAY = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String dateFormatted = TODAY.format(formatter);
		HRoot historical=HRoot.refresh(city, dateFormatted);
		HashMap<String, String> Final = new HashMap<>();
		double MaxTemp = 0.0;
		double MinTemp = 0.0;
		double AvgTemp = 0.0;
		double MaxSpeWin = 0.0;
		double PreMil = 0.0;
		double Vis = 0.0;
		double AvgHum = 0.0;
		int i;
		
		Final.put("city", historical.getLocation().getName());
		Final.put("region", historical.getLocation().getRegion());
		Final.put("country", historical.getLocation().getCountry());
		if(howMuchDay>=6) 
		{
			Final.put("day", 6+"");
		}else {
			Final.put("day", howMuchDay+"");	
		}	
		for(i =(today ? 0 : 1);
    	i<6 && i<howMuchDay;
    	i++) {
			
			if(AmericanUnit) {
				MaxTemp+=historical.getForecast().getForecastday().getDay().getMaxtempF().doubleValue();
				MinTemp+=historical.getForecast().getForecastday().getDay().getMintempF().doubleValue();
				AvgTemp+=historical.getForecast().getForecastday().getDay().getAvgtempF().doubleValue();
				MaxSpeWin+=historical.getForecast().getForecastday().getDay().getMaxwindMph().doubleValue();
				PreMil+=historical.getForecast().getForecastday().getDay().getTotalprecipIn().doubleValue();
				Vis+=historical.getForecast().getForecastday().getDay().getAvgvisMiles();
		    }else {
		    	MaxTemp+=historical.getForecast().getForecastday().getDay().getMaxtempC().doubleValue();
				MinTemp+=historical.getForecast().getForecastday().getDay().getMintempC().doubleValue();
				AvgTemp+=historical.getForecast().getForecastday().getDay().getAvgtempC().doubleValue();
				MaxSpeWin+=historical.getForecast().getForecastday().getDay().getMaxwindKph().doubleValue();
				PreMil+=historical.getForecast().getForecastday().getDay().getTotalprecipMm().doubleValue();
				Vis+=historical.getForecast().getForecastday().getDay().getAvgvisKm().doubleValue();
		    }
			AvgHum+=historical.getForecast().getForecastday().getDay().getAvgvisKm().doubleValue();
			LocalDate dateModify = LocalDate.parse(historical.getForecast().getForecastday().getDate().toString() , DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        LocalDate dateModified = dateModify.minusDays(1);
	        dateModified.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        historical=HRoot.refresh(city, dateModified.toString());
	    }
		
		
		Final.put("maxTemp", Math.round(MaxTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("minTemp", Math.round(MinTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("avgTemp", Math.round(AvgTemp/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("winSpe", Math.round(MaxSpeWin/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("precip", Math.round(PreMil/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("avgVis", Math.round(Vis/(i-(today ? 0 : 1))*100.00)/100.00+"");
		Final.put("avgHum", Math.round(AvgHum/(i-(today ? 0 : 1))*100.00)/100.00+"");


		return Final;
	}
	

}