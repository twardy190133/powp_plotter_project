package edu.iis.powp.ink;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import commands.PlotterCommand;
import commands.RectFactory;
import edu.iis.powp.adapter.PlotterDrawPanelAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.decorator.DriverAdapter;
import edu.iis.powp.decorator.Manager;

public class InkDrawerTest {

	public static void main(String[] args) {
		
		Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

		ApplicationWithDrawer.configureApplication();
		Application.addComponent(Logger.class);
		LOGGER.setLevel(Level.FINE);

		Manager m = new Manager();
		PlotterDrawPanelAdapter inkPlotter = new PlotterDrawPanelAdapter();
		DriverAdapter dA = new DriverAdapter(inkPlotter, m);
		dA.loadInk(Integer.parseInt(JOptionPane.showInputDialog("Give quantity of the ink ")));
        PlotterCommand pc = RectFactory.buildRect(-50, -50, 250, 100);
        pc.execute(dA);
        LOGGER.log(Level.FINE, "ink left " + dA.checkInt() );
        
	}

}

