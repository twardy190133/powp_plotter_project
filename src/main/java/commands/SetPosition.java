package commands;

import edu.iis.client.plottermagic.IPlotter;

public class SetPosition implements PlotterCommand {

	private int x;
	private int y;
	@Override
	public void execute(IPlotter p) {
		p.setPosition(x, y);
	}
	public SetPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
