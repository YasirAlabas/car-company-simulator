package exceptions;

public class AlreadyReservedException extends Exception {

	public AlreadyReservedException(){
		super("Already reserved");
	}
	public AlreadyReservedException(String message){
		super(message);
	}
}
