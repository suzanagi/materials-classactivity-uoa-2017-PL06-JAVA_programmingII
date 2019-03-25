
public class CannotReplaceException extends Exception {
	public CannotReplaceException(){}
	public CannotReplaceException(String details){
		super(details);
	}
	public CannotReplaceException(Throwable cause){
		super(cause);
	}
	public CannotReplaceException(String details, Throwable cause){
		super(details, cause);
	}

}
