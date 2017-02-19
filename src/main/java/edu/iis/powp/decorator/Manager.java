package edu.iis.powp.decorator;

public class Manager implements IInkManager{


	private int inkQuantity;
	public Manager() {
	
		inkQuantity = 0;
	}
	
	@Override
	public void loadInk(int quantity) {
	
		inkQuantity += quantity;
		
		
	}

	@Override
	public int takeInk(int quantity) {
		decreaseInk(quantity);
		return checkInk();
	}

	@Override
	public int checkInk() {
			return inkQuantity;
	}

	public void decreaseInk(int quantity) {
		if(quantity>inkQuantity) {
			
		} else {
			inkQuantity -= quantity;
		}
	}

	

}
