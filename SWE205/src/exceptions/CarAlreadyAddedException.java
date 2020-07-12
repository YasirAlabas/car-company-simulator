package exceptions;

public class CarAlreadyAddedException extends Exception {

	public CarAlreadyAddedException(){
		super("Car Already Added Excepion");
		
	}
	
	public CarAlreadyAddedException(String msg){
		super(msg);
		
	}
}
