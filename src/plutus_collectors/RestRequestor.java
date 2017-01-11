package plutus_collectors;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class RestRequestor {

	private final String USER_AGENT = "Mozilla/5.0";

	private String data;
	private String url;
	
	public RestRequestor(String url){
		
	data = "";	
		
	this.url = url;
	
	}
	

	// HTTP GET request
	public boolean sendGet(){

		try{
			
		

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

			//set response data;
			data = response.toString();
		
			} catch (Exception e){
			
			//set response to error message and return false	
			data = e.getMessage();
			
		    return false;
		    
		}
			
			
			return true;
			
		
		

	}
	
	public String getResults(){
		
		return data;
		
		
	}
	
}
