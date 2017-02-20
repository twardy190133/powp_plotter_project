package commands;

public class RectFactory {

	public static PlotterCommand buildRect(int x, int y, int w, int h) {
		ComplexCommand cc = new ComplexCommand();
		
		cc.add(new SetPosition(x,y));
		cc.add(new DrawLineToPosition(x+w,y));
		cc.add(new SetPosition(x+w,y));
		cc.add(new DrawLineToPosition(x+w,y+h));
		cc.add(new SetPosition(x+w,y+h));
		cc.add(new DrawLineToPosition(x,y+h));
		cc.add(new SetPosition(x,y+h));
		cc.add(new DrawLineToPosition(x,y));
		return cc;
	}
}
