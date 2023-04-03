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
		ris=forecast.Future("Nervesa della Battaglia", 5, true, false);
		Window gui = new Window(forecast,historical,ris);
		gui.setVisible(true);
	}
}
