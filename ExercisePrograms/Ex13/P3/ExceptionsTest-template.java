public class ExceptionsTest {
  private static String owners[] = {"Owner1","Owner2","Owner3"};
  private static String lpns[] = {"LPN1", "LPN2","LPN3"};

 private static int findVehicleByOwner(String ownerName) 
      throws NoSuchOwnerException 
  {
      for(int i=0; i<owners.length; i++) {
          if (ownerName.equals(owners[i])) return i;
      }

   // Not found, write your code for raising the "NoSuchOwnerException".

  }

 static void replaceLPN(String ownerName, String lpn) 
   // write a throws clause for the "CannotReplaceException" exception.
  {

   // Write your code to do the followings:
     1) Find an owner index with "ownerName" using the "findVehicleByOwner()" method, and replace the old LPN with the new one.
     2) If the "NoSuchOwnerExceptio" catched, raise the "CanotReplaceException"

  }

 public static void main(String[] args) {
   try {
       replaceLPN("Owner4", "LPN4-2");
    } catch(CannotReplaceException e ) {
       System.out.println("In main, Exceptions: " + e.getCause().getMessage() 
      + ", " + e.getMessage());
    }
 }
}
