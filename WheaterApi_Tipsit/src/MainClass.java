import java.util.HashMap;

import javax.xml.bind.JAXBException;

import GUI.*;
import Forecast.Method_Forecast;
import Forecast.Root;
import Historical.Method_Historical;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Forecast forecast = new Method_Forecast();
		Method_Historical historical = new Method_Historical();
		HashMap<String, String> ris = new HashMap<>();
		Window gui = new Window();
		gui.initialize();
		gui.setVisible(true);
		try {
			ris=forecast.Future("New York", 5, true, false);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Root.refresh("Treviso");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ris.get("city"));
	}

}
