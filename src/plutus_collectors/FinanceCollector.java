package plutus_collectors;

public class FinanceCollector implements Collector {

	private String dataset;
	private String[] config_parameters;
	
	public FinanceCollector(){
		
		this.dataset = "{}";
		this.config_parameters = new String[10];
	}
	
	@Override
	public void runCollector() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return this.dataset;
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
