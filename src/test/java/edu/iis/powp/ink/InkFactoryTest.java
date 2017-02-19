package edu.iis.powp.ink;

import edu.iis.powp.adapter.PlotterDrawPanelAdapter;
import edu.iis.powp.decorator.DriverAdapter;
import edu.iis.powp.decorator.InkFactory;
import edu.iis.powp.decorator.Manager;

import org.junit.Assert;
import org.junit.Test;
public class InkFactoryTest {

	@Test
	public void testCreation() {
		PlotterDrawPanelAdapter clientPlotter = new PlotterDrawPanelAdapter();
    	
    	DriverAdapter dA = new DriverAdapter(clientPlotter, new Manager());
    	InkFactory iF = new InkFactory(dA);
        Assert.assertEquals(iF.getInk(),0);
   
    }
	@Test
	public void testAdd() {
		PlotterDrawPanelAdapter clientPlotter = new PlotterDrawPanelAdapter();
    	DriverAdapter dA = new DriverAdapter(clientPlotter, new Manager());
    	InkFactory iF = new InkFactory(dA);
    	iF.loadInk(100);
        Assert.assertEquals(iF.getInk(),100);
   
    }
    
	
    
    
	
}
