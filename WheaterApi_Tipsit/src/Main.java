import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.xml.bind.JAXBException;

import Forecast.Method_Forecast;
import Forecast.Root;
import Historical.HRequestToServer;
import Historical.Method_Historical;

import java.text.ParseException;

//API Key
//4dcd56b9af624eaaa11132617231503
//Api Link
//https://www.weatherapi.com/api-explorer.aspx

public class Main {

	public static void main(String[] args) throws JAXBException, ParseException{
		// TODO Auto-generated method stub
		Scanner TMP = new Scanner(System.in);
		String city = Root.refresh().getLocation().getName();
		Root.refresh(Root.refresh().getLocation().getName());
		String last = city;
		Method_Forecast forecast = new Method_Forecast();
		Method_Historical historical = new Method_Historical();
		HashMap<String, String> ris = new HashMap<>();
		
		while(!city.equals("0")){
			System.out.println("Insert City (0 for Exit): ");
			city = TMP.nextLine();
			if(!city.equals("0")) {
				if(!city.equals(last))
				{
					last=city;
					Root.refresh(city);
				}
				int tmp2=1;
				System.out.println("Choices:\n"
						+ "1-Future\n"
						+ "2-DayandHour\n"
						+ "3-Day\n"
						+ "4-Statistic\n"
						+ "5-FindDayOfWeek\n"
						+ "6-Past\n"
						+ "7-PastDayandHour\n"
						+ "8-PastDay\n"
						+ "9-PastStatistic\n"
						);
				tmp2 = TMP.nextInt();
				System.out.println("\n\n");
				Boolean americanUnit=true; //1,2,3,4,5,8,9
				int howMuchDay=0; // 2,5,7
				boolean today=true; // 2,5,7
				String date=""; // 3,4,8,9,11
				boolean localtime=true; //11
				
				switch(tmp2) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 6:
				case 7:
				case 8:
				case 9:
					System.out.println("Do you want American Unit? 1-Yes 2-No\n");
					int tmp3 = TMP.nextInt();
					if(tmp3==1) {
						americanUnit=true;
					}else {
						americanUnit=false;
					}
					break;
				}
				
				switch(tmp2) {
				case 1:
				case 4:
				case 6:
				case 9:
					System.out.println("How much day of forecast do you wanna see?");
					howMuchDay = TMP.nextInt(); 
					System.out.println("Do you wanna consider also today? 1-yes 2-no");
					int tmp3 = TMP.nextInt();
					if(tmp3==1) {
						today=true;
					}else {
						today=false;
					}
					break;
				}
				
				switch(tmp2) {
				case 2:
				case 3:
				case 5:
				case 7:
				case 8:
					TMP.nextLine();
					System.out.println("write a day in format yyyy-mm-dd HH:MM");
					String tmp3 = TMP.nextLine();
					date=tmp3;
					break;
				}
				
				switch(tmp2) {
				case 5:
					System.out.println("is in the format localtime? 1-yes 2-no");
					int tmp3 = TMP.nextInt();
					if(tmp3==1) {
						localtime=true;
					}else {
						localtime=false;
					}
					break;
				}
				
				switch(tmp2) {
				case 1:
					ris=forecast.Future(city, howMuchDay, today, americanUnit); 
					System.out.println(ris.get("city"));
					System.out.println(ris.get("region"));
					System.out.println(ris.get("country"));
					for(int i=0;i<5;i++) {
						System.out.println(ris.get("date"+i));
						System.out.println(ris.get("avgTemp"+i));
						System.out.println(ris.get("maxWind"+i));
						System.out.println(ris.get("avgVis"+i));
						System.out.println(ris.get("avgHum"+i));
						System.out.println(ris.get("chaRai"+i));
						System.out.println(ris.get("cond"+i));
					}
					break;
				case 2:
					ris=forecast.DayandHour(city, americanUnit, date); 
					System.out.println(ris.get("city"));
					System.out.println(ris.get("region"));
					System.out.println(ris.get("country"));
					System.out.println(ris.get("date"));
					System.out.println(ris.get("temp"));
					System.out.println(ris.get("cond"));
					System.out.println(ris.get("winSpe"));
					System.out.println(ris.get("winDir"));
					System.out.println(ris.get("precip"));
					System.out.println(ris.get("hum"));
					System.out.println(ris.get("cloud"));
					System.out.println(ris.get("feeTemp"));
					System.out.println(ris.get("Co"));
					System.out.println(ris.get("No2"));
					System.out.println(ris.get("O3"));
					System.out.println(ris.get("Pm10"));
					System.out.println(ris.get("Pm25"));
					System.out.println(ris.get("So2"));
					break;
				case 3:
					ris=forecast.Day(city, americanUnit, date); 
					System.out.println(ris.get("city"));
					System.out.println(ris.get("region"));
					System.out.println(ris.get("country"));
					System.out.println(ris.get("date"));
					System.out.println(ris.get("maxTemp"));
					System.out.println(ris.get("minTemp"));
					System.out.println(ris.get("avgTemp"));
					System.out.println(ris.get("maxWin"));
					System.out.println(ris.get("precip"));
					System.out.println(ris.get("snow"));
					System.out.println(ris.get("avgVis"));
					System.out.println(ris.get("hum"));
					System.out.println(ris.get("chaRai"));
					System.out.println(ris.get("chaSno"));
					System.out.println(ris.get("Co"));
					System.out.println(ris.get("No2"));
					System.out.println(ris.get("O3"));
					System.out.println(ris.get("Pm10"));
					System.out.println(ris.get("Pm25"));
					System.out.println(ris.get("So2"));
					break;
				case 4:
					ris=forecast.Statistic(city, howMuchDay,today, americanUnit); 
					System.out.println(ris.get("city"));
					System.out.println(ris.get("region"));
					System.out.println(ris.get("country"));
					System.out.println(ris.get("maxTemp"));
					System.out.println(ris.get("minTemp"));
					System.out.println(ris.get("avgTemp"));
					System.out.println(ris.get("maxSpeWin"));
					System.out.println(ris.get("precip"));
					System.out.println(ris.get("snow"));
					System.out.println(ris.get("vis"));
					System.out.println(ris.get("avgHum"));
					System.out.println(ris.get("chaRai"));
					System.out.println(ris.get("chaSno"));
					System.out.println(ris.get("Co"));
					System.out.println(ris.get("No2"));
					System.out.println(ris.get("O3"));
					System.out.println(ris.get("Pm10"));
					System.out.println(ris.get("Pm25"));
					System.out.println(ris.get("So2"));
					break;
				case 5:
					System.out.println(forecast.FindDayOfWeek(date,true)); 
					break;
				case 6:
					ris=historical.Past(city, howMuchDay, today, americanUnit); 
					System.out.println(ris.get("city"));
					System.out.println(ris.get("region"));
					System.out.println(ris.get("country"));
					for(int i=0;i<5;i++) {
						System.out.println(ris.get("date"+i));
						System.out.println(ris.get("maxTemp"+i));
						System.out.println(ris.get("minTemp"+i));
						System.out.println(ris.get("avgTemp"+i));
						System.out.println(ris.get("maxWin"+i));
						System.out.println(ris.get("precip"+i));
						System.out.println(ris.get("avgVis"+i));
						System.out.println(ris.get("avgHum"+i));
						System.out.println(ris.get("cond"+i));
					}
					break;
				case 7:
					ris=historical.PastDayandHour(city, americanUnit, date); 
					System.out.println(ris.get("city"));
					System.out.println(ris.get("region"));
					System.out.println(ris.get("country"));
					System.out.println(ris.get("date"));
					System.out.println(ris.get("temp"));
					System.out.println(ris.get("cond"));
					System.out.println(ris.get("winSpee"));
					System.out.println(ris.get("winDir"));
					System.out.println(ris.get("precip"));
					System.out.println(ris.get("hum"));
					System.out.println(ris.get("cloud"));
					System.out.println(ris.get("feeTemp"));
					break;
				case 8:
					ris=historical.PastDay(city, americanUnit, date); 
					System.out.println(ris.get("city"));
					System.out.println(ris.get("region"));
					System.out.println(ris.get("country"));
					System.out.println(ris.get("date"));
					System.out.println(ris.get("maxTemp"));
					System.out.println(ris.get("minTemp"));
					System.out.println(ris.get("avgTemp"));
					System.out.println(ris.get("precip"));
					System.out.println(ris.get("avgVis"));
					System.out.println(ris.get("avgHum"));
					System.out.println(ris.get("cond"));
					break;
				case 9:
					ris=historical.PastStatistic(city, howMuchDay, today, americanUnit); 
					System.out.println(ris.get("city"));
					System.out.println(ris.get("region"));
					System.out.println(ris.get("country"));
					System.out.println(ris.get("day"));
					System.out.println(ris.get("maxTemp"));
					System.out.println(ris.get("minTemp"));
					System.out.println(ris.get("avgTemp"));
					System.out.println(ris.get("precip"));
					System.out.println(ris.get("avgVis"));
					System.out.println(ris.get("avgHum"));
					break;
				}
				System.out.println("\n\n");
				city = TMP.nextLine();
			}
		}
		TMP.close();
	}

}