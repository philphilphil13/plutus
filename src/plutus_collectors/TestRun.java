package plutus_collectors;

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collector finance_collector = new FinanceCollector();
		String [] params = {"20170221", "20170222","MSFT"};
		finance_collector.configureCollector(params);
		
		Writer cli_writer = new CommandLineWriter();
		Writer file_writer = new FileWriter();
		
		Controller controller = new Controller();
		
		controller.addCollector(finance_collector);
		controller.addWriter(cli_writer);
		//controller.addWriter(file_writer);
		
		
		controller.executeWorflow();
		

	}

}
