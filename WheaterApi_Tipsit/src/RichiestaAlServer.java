	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class RichiestaAlServer {

	    public RichiestaAlServer() {}
	    
	    public static String replaceSpaces(String input) {
	        StringBuilder output = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c == ' ') {
	                output.append("%20");
	            } else {
	                output.append(c);
	            }
	        }
	        return output.toString();
	    }
	    
	    public String UrlForecast(String Citta) {
	    	return "http://api.weatherapi.com/v1/forecast.xml?key=4dcd56b9af624eaaa11132617231503&q="+replaceSpaces(Citta)+"&days=10&aqi=yes&alerts=yes";
	    }
	    
	    public void Richiesta(String Url) {
	    	try {
	            // Crea l'URL dell'API e apre una connessione HTTP
	            URL url = new URL(Url);
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            conn.setRequestMethod("GET");

	            // Legge il contenuto della risposta HTTP
	            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            String inputLine;
	            StringBuilder response = new StringBuilder();
	            while ((inputLine = in.readLine()) != null) {
	                response.append(inputLine);
	            }
	            in.close();

	            // Stampa il documento XML ricevuto dalla risposta HTTP
	            //System.out.println(response.toString());
	            new XmlFromString(response.toString());
	        } catch (Exception e) {
	            System.err.println("Errore durante la richiesta XML: " + e.getMessage());
	        }
	    }
}
