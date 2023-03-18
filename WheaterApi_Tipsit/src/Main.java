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
		Metodi_Previsioni prova = new Metodi_Previsioni();
		
		while(!tmp.equals("0")){
			System.out.println("Inserisci città (0 per ultimare): ");
			tmp = TMP.nextLine();
			if(!tmp.equals("0")) {
				System.out.println(prova.Today(tmp)+"\n\n");
				for(int i=0;i<prova.Future(tmp, 6, false).size();i++) {
					System.out.println(prova.Future(tmp, 6, false).get(i));
				}
				System.out.println("\n\n"+prova.Statistic(tmp, 6, false)+"\n\n");
				
				System.out.println(prova.AirToday(tmp)+"\n\n");
				for(int i=0;i<prova.AirFuture(tmp, 6, false).size();i++) {
					System.out.println(prova.AirFuture(tmp, 6, false).get(i));
				}
				System.out.println("\n\n"+prova.AirStatistic(tmp, 6, false)+"\n\n");
				
				System.out.println("\n\n\n\n");
			}
		}
	}

}