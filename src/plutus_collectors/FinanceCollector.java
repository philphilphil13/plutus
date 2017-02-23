package plutus_collectors;

import org.json.JSONObject;

public class FinanceCollector implements Collector {

	private String dataset;
	private String[] config_parameters;
	private String url;
	
	public FinanceCollector(){
		
		this.dataset = "{}";
		this.config_parameters = new String[10];
		
		
		//this.url = "https://www.quandl.com/api/v3/datatables/WIKI/PRICES.json?date.gte=20150101&date.lt=20170222&ticker=MSFT&api_key=1mnxzeY4FDdPDRxdx_DY";
		this.url ="";
	}
	
	@Override
	public void runCollector() {
		// TODO Auto-generated method stub
		
		RestRequestor rest_request= new RestRequestor(url);
		
		rest_request.sendGet();
		
		this.dataset = rest_request.getResults();
		
		
	}

	@Override
	public String getData() {
		
		JSONObject json = new JSONObject(this.dataset); // Convert text to object
		
		return json.toString(4); // 

		
		
	}

	@Override
	/**
	 * Three values in config params array: 0 = from date, 1 = to date, 2 = ticker
	 */
	public boolean configureCollector(String[] config_parameters) {
		
		try{
			
		this.config_parameters = config_parameters;
		
		this.url = "https://www.quandl.com/api/v3/datatables/WIKI/PRICES.json?date.gte="+this.config_parameters[0]+"&date.lt="+this.config_parameters[1]+"&ticker="+this.config_parameters[2]+"&api_key=1mnxzeY4FDdPDRxdx_DY";
				
		}catch(Exception e){
		
		System.out.println(e.getMessage());
		
		return false;
		
	}
		
		
		return true;
	}

	@Override
	public String[] getCurrentConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	

}
