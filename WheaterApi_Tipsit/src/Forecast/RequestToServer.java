package Forecast;

	import java.net.HttpURLConnection;
	import java.net.URL;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	

	public class RequestToServer {

	    public RequestToServer() {}
	    
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
	    
	    public String UrlForecast(String city) {
	    	return "http://api.weatherapi.com/v1/forecast.xml?key=4dcd56b9af624eaaa11132617231503&q="+replaceSpaces(city)+"&days=5&aqi=yes&alerts=yes";
	    }
	    
	    public void Request(String Url) {
	    	try {
	            // Create the URL of API and open one connection HTTP
	            URL url = new URL(Url);
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            conn.setRequestMethod("GET");

	            // read the content of the answer HTTP
	            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            String inputLine;
	            StringBuilder response = new StringBuilder();
	            while ((inputLine = in.readLine()) != null) {
	                response.append(inputLine);
	            }
	            in.close();

	            // Print the document XML received of the answer HTTP
	            //System.out.println(response.toString())
	            new XmlFromString(response.toString());
	        } catch (Exception e) {
	            System.err.println("Error during request to XML: " + e.getMessage());
	        }
	    }
}
