package plutus_collectors;

import java.util.ArrayList;

public class Controller {

	private ArrayList<Writer> writers;
	private ArrayList<Collector> collectors;
	
	public Controller(){
		
		this.writers = new ArrayList<Writer>();
		this.collectors = new ArrayList<Collector>();
		
		}
	
	
	public void addCollector(Collector collector){
		
		
		this.collectors.add(collector);
		
	}
	
	
	public void addWriter(Writer writer){
		
		this.writers.add(writer);
		
		
	}
	
	
	public void executeWorflow(){
		
		// update datasets;
		for (Collector c: collectors){
			
			c.runCollector();
		
				
		}
		
		
		// write every dataset on each writer in queue;
		for (Writer w: writers){
			
			
				for(Collector c: collectors){
					
					
					w.writeDataToDestination(c.getData());
					
				}
			
			
		}
		
		
		
	}
	
	
	
	
	
}
