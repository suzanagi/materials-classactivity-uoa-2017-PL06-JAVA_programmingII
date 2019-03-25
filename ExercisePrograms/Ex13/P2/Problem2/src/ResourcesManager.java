import java.io.FileNotFoundException;

public class ResourcesManager {
	void getResource() throws ResourceNotFoundException {
		try {
			getFileResource();
		} catch (FileNotFoundException e) {
			throw new ResourceNotFoundException(e);
		}
	}
	
	void getFileResource() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
}
