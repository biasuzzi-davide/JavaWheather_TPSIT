	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class Prova {

	    public Prova() {
	        
	    }
	    
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

	    
	    public String Url(String Citta) {
	    	return "http://api.weatherapi.com/v1/current.xml?key=4dcd56b9af624eaaa11132617231503&q="+replaceSpaces(Citta)+"&aqi=yes\r\n";
	    }
	    
	    public void Richiesta(String Url) {
	    	try {
	            // Crea l'URL dell'API e apre una connessione HTTP
<<<<<<< HEAD
	            URL url = new URL(Url);
=======
	            URL url = new URL("http://api.weatherapi.com/v1/current.xml?key=4dcd56b9af624eaaa11132617231503&q=Nervesa&aqi=no\r\n"
	            		+ "");
>>>>>>> master
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
	            new XmlFromStringExample(response.toString());
	        } catch (Exception e) {
	            System.err.println("Errore durante la richiesta XML: " + e.getMessage());
	        }
	    }
}
