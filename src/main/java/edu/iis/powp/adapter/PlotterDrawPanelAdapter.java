package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

/**
 * Plotter adapter to drawer with several bugs.
 */
public class PlotterDrawPanelAdapter implements IPlotter {
	private int startX = 0, startY = 0;
	private DrawPanelController drawController;

	public PlotterDrawPanelAdapter() {
		drawController = Application.getComponent(DrawPanelController.class);
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void drawTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		drawController.drawLine(line);
	}

	public void drawToDotted(int x, int y) {
		ILine line = LineFactory.getDottedLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		drawController.drawLine(line);
	}
	@Override
	public String toString() {
		return "Standard line plotter";
	}
	
	
	
}
