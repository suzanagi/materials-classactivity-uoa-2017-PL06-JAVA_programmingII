
public class NoSuchOwnerException extends Exception {
	public NoSuchOwnerException(){}
	public NoSuchOwnerException(String details){
		super(details);
	}
	public NoSuchOwnerException(Throwable cause){
		super(cause);
	}
	public NoSuchOwnerException(String details, Throwable cause){
		super(details, cause);
	}
}
