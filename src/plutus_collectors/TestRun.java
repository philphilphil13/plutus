package plutus_collectors;

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collector finance_collector = new FinanceCollector();
		Writer cli_writer = new CommandLineWriter();
		Writer file_writer = new FileWriter();
		
		Controller controller = new Controller();
		
		controller.addCollector(finance_collector);
		//controller.addWriter(cli_writer);
		controller.addWriter(file_writer);
		
		
		controller.executeWorflow();
		

	}

}
