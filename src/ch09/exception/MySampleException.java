package ch09.exception;

public class MySampleException extends Exception {

	public MySampleException() {
		super();
	}
	
	public MySampleException(String message) {
		super(message);
	}
	
	public MySampleException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public MySampleException(Throwable cause) {
		super(cause);
	}

}
