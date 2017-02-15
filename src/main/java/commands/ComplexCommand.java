package commands;

import java.util.ArrayList;
import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private final ArrayList<PlotterCommand> commands;
	
	public ComplexCommand() {
		this.commands = new ArrayList<>();
	}
	
	public void add(PlotterCommand c) {
		commands.add(c);
		
	}
	
	@Override
	public void execute(IPlotter plotter) {
		for(PlotterCommand com : commands) {
			com.execute(plotter);
		}
	}



}
