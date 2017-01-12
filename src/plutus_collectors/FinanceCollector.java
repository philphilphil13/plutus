package plutus_collectors;

import org.json.JSONObject;

public class FinanceCollector implements Collector {

	private String dataset;
	private String[] config_parameters;
	private String url;
	
	public FinanceCollector(){
		
		this.dataset = "{}";
		this.config_parameters = new String[10];
		
		
		this.url = "https://www.quandl.com/api/v3/datatables/WIKI/PRICES.json?date.gte=20150101&date.lt=20160101&ticker=MSFT&api_key=1mnxzeY4FDdPDRxdx_DY";
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
	public boolean configureCollector(String[] config_parameters) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getCurrentConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	

}
