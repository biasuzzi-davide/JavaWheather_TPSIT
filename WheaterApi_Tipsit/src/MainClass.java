import java.util.HashMap;

import javax.xml.bind.JAXBException;

import GUI.*;
import Forecast.Method_Forecast;
import Forecast.Root;
import Historical.Method_Historical;

public class MainClass {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		Method_Forecast forecast = new Method_Forecast();
		Method_Historical historical = new Method_Historical();
		HashMap<String, String> ris = new HashMap<>();
		Window gui = new Window();
		gui.initialize();
		gui.setVisible(true);
		ris=forecast.Future("New York", 5, true, false);
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
	}

}
