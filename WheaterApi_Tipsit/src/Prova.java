	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class Prova {

	    public static void main(String[] args) {
	        try {
	            // Crea l'URL dell'API e apre una connessione HTTP
	            URL url = new URL("http://api.weatherapi.com/v1/current.xml?key=4dcd56b9af624eaaa11132617231503&q=Nervesa&aqi=no\r\n"
	            		+ "");
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
