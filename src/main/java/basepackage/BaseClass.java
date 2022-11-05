package basepackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class BaseClass {
	@BeforeSuite	
	public void configureBS()
	   {
		System.out.println("connect to database");
	   }
	 @BeforeTest
	   public void configureBT()
	   {
		   System.out.println("execute the script in the parallel mode");
	   }
	 @BeforeClass
	   public void configureBC()
	   {
		   System.out.println("Launching Browser");
	   }
	 @BeforeMethod
	   public void configureBM()
	   {
		   System.out.println("Login to the application");
	   }
	 @AfterMethod
	   public void configureAM()
	   {
		   System.out.println("logout from the apllication");
	   }
	 @AfterClass
	   public void configureAC()
	   {
		  System.out.println("Close the Browser"); 
	   }
	 @AfterTest
	   public void configureAT()
	   {
		   System.out.println("Close parallel mode");
	   }
	 @AfterSuite
	   public void configureAS()
	   {
		   System.out.println("Close the database connection");
	   }
}
