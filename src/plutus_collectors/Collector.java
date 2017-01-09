package plutus_collectors;

public interface Collector {
	
	
	/* Runs the collector and retrieves an update to the collected data */
	public void runCollector();
	
	/* Returns the most current collected data as a variable */
	public String getData();
	
	/*Configures Collector with passed configuration parameters. Returns true if configuration is successful*/
	public boolean configureCollector(String[] config_parameters);
	
	/*Returns currently set configuration parameters*/
	public String[] getCurrentConfiguration();

}
