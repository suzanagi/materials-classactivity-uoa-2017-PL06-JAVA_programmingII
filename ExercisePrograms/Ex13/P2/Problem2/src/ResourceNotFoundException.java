
public class ResourceNotFoundException extends Exception {
	public ResourceNotFoundException(){}
	
	public ResourceNotFoundException(String details){
		super(details);
	}
	
	public ResourceNotFoundException(Throwable cause){
		super(cause);
	}
	
	public ResourceNotFoundException(String details, Throwable cause){
		super(details, cause);
	}
}
