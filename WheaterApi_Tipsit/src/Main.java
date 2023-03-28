import java.io.File;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import Forecast.Root;

import java.text.ParseException;

//API Key
//4dcd56b9af624eaaa11132617231503
//Api Link
//https://www.weatherapi.com/api-explorer.aspx
 
public class Main {

	public static void main(String[] args) throws JAXBException, ParseException{
		// TODO Auto-generated method stub
		Scanner TMP = new Scanner(System.in);
		String tmp = "";
		Method_Forecast prove = new Method_Forecast();
		
		while(!tmp.equals("0")){
			JAXBContext context = JAXBContext.newInstance(Root.class);
		    Unmarshaller unmarshaller = context.createUnmarshaller();
		    RequestToServer Server=new RequestToServer();
			Server.Request(Server.UrlForecast("Treviso"));
			Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
			System.out.println("Insert City (0 for Exit): ");
			tmp = TMP.nextLine();
			if(!tmp.equals("0")) {
				int tmp2=1;
				System.out.println("Scegli:\n"
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
						+ "11-FindDayOfWeek\n");
				tmp2 = TMP.nextInt();
				System.out.println("\n\n");
				
				switch(tmp2) {
				case 1:
					System.out.println(prove.Today(tmp, false));
					break;
				case 2:
					for(int i=0;i<prove.Future(tmp, 6, false, false).size();i++) {
						System.out.println(prove.Future(tmp, 6, false, false).get(i));
					}
					break;
				case 3:
					System.out.println(prove.DayandHour(tmp, false, "2023-03-30 15:05"));
					break;
				case 4:
					System.out.println(prove.Day(tmp, false, "2023-03-30 16:05"));
					break;
				case 5:
					System.out.println("\n\n"+prove.Statistic(tmp, 6, false, true));
					break;
				case 6:
					System.out.println(prove.AirToday(tmp));
					break;
				case 7:
					for(int i=0;i<prove.AirFuture(tmp, 6, false).size();i++) {
						System.out.println(prove.AirFuture(tmp, 6, false).get(i));
					}
					break;
				case 8:
					System.out.println(prove.AirDayandHour(tmp, false, "2023-03-30 15:05"));
					break;
				case 9:
					System.out.println(prove.AirDay(tmp, false, "2023-03-30 16:05"));
					break;
				case 10:
					System.out.println("\n\n"+prove.AirStatistic(tmp, 6, false));
					break;
				case 11:
					System.out.println("Day of the week: "+prove.FindDayOfWeek(forecast.getLocation().getLocaltime().toString(),true));
					break;
				}
				System.out.println("\n\n");
				tmp = TMP.nextLine();
			}
		}
		TMP.close();
	}

}