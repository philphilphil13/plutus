package plutus_collectors;

public interface Writer {
	
	/*Writes data to destination, returns true if write operation was succesful*/
public boolean writeDataToDestination(String data);	

	/* Configures parameters of writer */
public boolean configureWriter(String[] config_parameters);


public String[] getConfigParameters();

}
