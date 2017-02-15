package commands;

import edu.iis.client.plottermagic.IPlotter;

public class DrawLineToPosition implements PlotterCommand {

	private int x;
	private int y;
	public DrawLineToPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void execute(IPlotter p) {
		p.drawTo(x, y);
	}
	
	
	
	


	
}
