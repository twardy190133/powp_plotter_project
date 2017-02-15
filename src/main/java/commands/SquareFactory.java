package commands;

public class SquareFactory {

	public static PlotterCommand buildSquare(int x, int y, int size) {
		ComplexCommand cc = new ComplexCommand();
		
		cc.add(new SetPosition(x,y));
		cc.add(new DrawLineToPosition(x+size,y));
		cc.add(new DrawLineToPosition(x+size,y+size));
		cc.add(new DrawLineToPosition(x,y+size));
		cc.add(new DrawLineToPosition(x,y));
		return cc;
	}
	
}
