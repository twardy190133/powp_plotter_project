package edu.iis.powp.decorator;

public interface IInkManager {

		void loadInk(int quantity);
		int takeInk(int quantity);
		int checkInk();
	
}
