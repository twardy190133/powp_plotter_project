package edu.iis.powp.decorator;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.PlotterDrawPanelAdapter;
import edu.kis.powp.drawer.panel.DrawPanelController;


public class DriverAdapter implements IPlotter{

	private int startX = 0, startY = 0;
	private DrawPanelController drawController;
	private Manager m;
	private PlotterDrawPanelAdapter plotter;
	public DriverAdapter(PlotterDrawPanelAdapter p) {
		
		drawController = new DrawPanelController();
	
		this.plotter = p;
	
	}
	
	public DriverAdapter(PlotterDrawPanelAdapter p, Manager m) {
		drawController =  new DrawPanelController();
		this.plotter = p;
		this.m = m;
	}

	
	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
		plotter.setPosition(x, y);
	
	
	}

	@Override
	public void drawTo(int x, int y) {
	

	
		Double length =  Math.sqrt(Math.pow(x - this.startX, 2) + Math.pow(y - this.startY, 2));

		if(length>m.checkInk()) {
	plotter.drawToDotted(x, y);
	
			m.decreaseInk(m.checkInk());
			
		} else{
			plotter.drawTo(x, y);
		m.decreaseInk(length.intValue());
		} 

		 
		
	}

	@Override
	public String toString() {
		return "ink test line plotter";
	}
	
	public void loadInk(int quantity) {
		m.loadInk(quantity);
	}

	public int checkInt() {
		return m.checkInk();
	}
	
	public void decreaseInk(int quantity) {
		m.decreaseInk(quantity);
	}

}
