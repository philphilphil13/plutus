package plutus_collectors;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileWriter implements Writer {

	
	@Override
	public boolean writeDataToDestination(String data) {
		
		
		
		try (PrintStream out = new PrintStream(new FileOutputStream("temp_files/test_data.json"))) {
			
		    out.print(data);
		    
		} catch (FileNotFoundException e) {
			
				e.printStackTrace();
			
			return false;
			
		}
		
		return false;
	}

	@Override
	public boolean configureWriter(String[] config_parameters) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getConfigParameters() {
		// TODO Auto-generated method stub
		return null;
	}

}
