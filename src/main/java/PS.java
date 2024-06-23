import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {

   @BeforeMethod
   public void beforeRun()
   {
   	System.out.println("run me first");
   }

   
    public void b()
    {
    	System.out.println("this is parent method");
    }
	}


