import java.text.ParseException;
import java.util.HashMap;

import javax.xml.bind.JAXBException;

import GUI.*;
import Forecast.Method_Forecast;
import Forecast.Root;

public class MainClass {

	public static void main(String[] args) throws JAXBException, ParseException {
		// TODO Auto-generated method stub
		Root.refresh(Root.getIstance().getLocation().getName());
		HashMap<String, String> ris = new HashMap<>();
		ris=Method_Forecast.Future(Root.getIstance().getLocation().getName(), 5, true, false);
		Window gui = new Window(ris);
		gui.setVisible(true);
	}
}