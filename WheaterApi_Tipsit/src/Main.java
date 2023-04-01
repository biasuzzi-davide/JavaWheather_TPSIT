import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.JAXBException;

import Forecast.Method_Forecast;
import Forecast.Root;
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
		String last = city;
		Method_Forecast prove = new Method_Forecast();
		Method_Historical prove1 = new Method_Historical();
		ArrayList<String> tmp = new ArrayList<String>();
		
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
						+ "1-Today\n"
						+ "2-Future\n"
						+ "3-DayandHour\n"
						+ "4-Day\n"
						+ "5-Statistic\n"
						+ "6-AirToday\n"
						+ "7-AirFuture\n"
						+ "8-AirDayandHour\n"
						+ "9-AirDay\n"
						+ "10-AirStatistic\n"
						+ "11-FindDayOfWeek\n"
						+ "12-Past\n"
						+ "13-PastDayandHour\n"
						+ "14-PastDay\n"
						+ "15-PastStatistic\n"
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
				case 5:
				case 12:
				case 13:
				case 14:
				case 15:
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
				case 2:
				case 5:
				case 7:
				case 10:
				case 12:
				case 15:
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
				case 3:
				case 4:
				case 8:
				case 9:
				case 11:
				case 13:
				case 14:
					TMP.nextLine();
					System.out.println("write a day in format yyyy-mm-dd HH:MM");
					String tmp3 = TMP.nextLine();
					date=tmp3;
					break;
				}
				
				switch(tmp2) {
				case 11:
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
					System.out.println(prove.Today(city, americanUnit));
					break;
				case 2:
					tmp = prove.Future(city, howMuchDay, today, americanUnit);
					for(int i=0;i<tmp.size();i++) {
						System.out.println(tmp.get(i));
					}
					break;
				case 3:
					System.out.println(prove.DayandHour(city, americanUnit, date));
					break;
				case 4:
					System.out.println(prove.Day(city, americanUnit, date));
					break;
				case 5:
					System.out.println(prove.Statistic(city, howMuchDay, today, americanUnit));
					break;
				case 6:
					System.out.println(prove.AirToday(city));
					break;
				case 7:
					tmp = prove.AirFuture(city, howMuchDay, today);
					for(int i=0;i<tmp.size();i++) {
						System.out.println(tmp.get(i));
					}
					break;
				case 8:
					System.out.println(prove.AirDayandHour(city, date));
					break;
				case 9:
					System.out.println(prove.AirDay(city, date));
					break;
				case 10:
					System.out.println(prove.AirStatistic(city, howMuchDay, today));
					break;
				case 11:
					System.out.println("Day of the week: "+prove.FindDayOfWeek(date,localtime));
					break;
				case 12:
					tmp = prove1.Past(city, howMuchDay, today, americanUnit);
					for(int i=0;i<tmp.size();i++) {
						System.out.println(tmp.get(i));
					}
					break;
				case 13:
					System.out.println(prove1.PastDayandHour(city, americanUnit, date));
					break;
				case 14:
					System.out.println(prove1.PastDay(city, americanUnit, date));
					break;
				case 15:
					System.out.println(prove1.PastStatistic(city, howMuchDay, today, americanUnit));
					break;
				}
				System.out.println("\n\n");
				city = TMP.nextLine();
			}
		}
		TMP.close();
	}

}