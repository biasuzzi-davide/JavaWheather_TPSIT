import java.util.Scanner;

import javax.xml.bind.JAXBException;

//Chiave API
//4dcd56b9af624eaaa11132617231503
//Link Api
//https://www.weatherapi.com/api-explorer.aspx
 
public class Main {

	public static void main(String[] args) throws JAXBException{
		// TODO Auto-generated method stub
		Scanner TMP = new Scanner(System.in);
		String tmp = "";
		Method_Forecast prove = new Method_Forecast();
		
		while(!tmp.equals("0")){
			System.out.println("Insert City (0 for Exit): ");
			tmp = TMP.nextLine();
			if(!tmp.equals("0")) {
				System.out.println(prove.Today(tmp, true)+"\n\n");
				for(int i=0;i<prove.Future(tmp, 6, false, true).size();i++) {
					System.out.println(prove.Future(tmp, 6, false, true).get(i));
				}
				System.out.println("\n\n"+prove.Statistic(tmp, 6, false, true)+"\n\n");
				
				System.out.println(prove.AirToday(tmp)+"\n\n");
				for(int i=0;i<prove.AirFuture(tmp, 6, false).size();i++) {
					System.out.println(prove.AirFuture(tmp, 6, false).get(i));
				}
				System.out.println("\n\n"+prove.AirStatistic(tmp, 6, false)+"\n\n");
				
				System.out.println("\n\n\n\n");
			}
		}
		TMP.close();
	}

}