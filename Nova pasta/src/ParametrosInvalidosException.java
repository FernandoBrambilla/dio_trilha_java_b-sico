
public class ParametrosInvalidosException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;

	public ParametrosInvalidosException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
