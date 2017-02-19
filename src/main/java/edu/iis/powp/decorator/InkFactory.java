package edu.iis.powp.decorator;

public class InkFactory {

	private DriverAdapter dA;
	
	public InkFactory(DriverAdapter dA) {
	this.dA = dA;
	}
	
	public void loadInk(int quantity) {
		dA.loadInk(quantity);
	}
	
	public int getInk() {
		return dA.checkInt();
	}
	
	public void draw(int xs, int ys, int x, int y) {
		dA.setPosition(xs, ys);
		dA.drawTo(x, y);
	}
}
