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
			System.out.println("Insert City (0 for Exit): ");
			tmp = TMP.nextLine();
			if(!tmp.equals("0")) {
				System.out.println(prove.Today(tmp, false)+"\n\n");
				for(int i=0;i<prove.Future(tmp, 6, false, false).size();i++) {
					System.out.println(prove.Future(tmp, 6, false, false).get(i));
				}
				System.out.println("\n\n"+prove.Statistic(tmp, 6, false, true)+"\n\n");
				
				System.out.println(prove.AirToday(tmp)+"\n\n");
				for(int i=0;i<prove.AirFuture(tmp, 6, false).size();i++) {
					System.out.println(prove.AirFuture(tmp, 6, false).get(i));
				}
				System.out.println("\n\n"+prove.AirStatistic(tmp, 6, false)+"\n\n");
				
				JAXBContext context = JAXBContext.newInstance(Root.class);
			    Unmarshaller unmarshaller = context.createUnmarshaller();
			    RequestToServer Server=new RequestToServer();
				Server.Request(Server.UrlForecast("Treviso"));
				Root forecast=(Root) unmarshaller.unmarshal(new File("src/Forecast/Forecast.xml"));
				
				System.out.println(prove.DayandHour(tmp, false, "2023-03-30 15:05"));
				
				System.out.println(prove.Day(tmp, false, "2023-03-30 16:05\""));
				
				System.out.println("Day of the week: "+prove.findDayOfWeek(forecast.getLocation().getLocaltime().toString(),true));
				
				System.out.println("\n\n\n\n");
			}
		}
		TMP.close();
	}

}