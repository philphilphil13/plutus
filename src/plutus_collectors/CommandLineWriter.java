package plutus_collectors;

public class CommandLineWriter implements Writer {

 private String[] config_pararemeters;
 
 
 public CommandLineWriter(){
	 
	 this.config_pararemeters = new String[10];
	 
 }
	
	
	@Override
	public boolean writeDataToDestination(String data) {
		// TODO Auto-generated method stub
		System.out.println(data);
		
			return true;
	}


	@Override
	public boolean configureWriter(String[] config_parameters) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public String[] getConfigParameters() {
		// TODO Auto-generated method stub
		return this.config_pararemeters;
	}

}
