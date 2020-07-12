package exceptions;

public class CarNotFoundException extends Exception {
	
	public CarNotFoundException(){
		super("Car Not Found Excepion");
		
	}
	
	public CarNotFoundException(String msg){
		super(msg);
		
	}

}
