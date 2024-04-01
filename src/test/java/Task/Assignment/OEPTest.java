package Task.Assignment;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;



public class OEPTest {
	String result;
	OEP oep=new OEP();
	@Given ("Create an OEP Game Play object")
	public  void Gameplay1() {
		OEP oep=new OEP();   
    }
	@When ("I Play the Game with number 3")
	public void play1() {
		
		result = oep.play(3);
		
		
	}
	@Then ("The result is ODD and PRIME")
	public void result1() {
		
		Assert.assertEquals("ODD and PRIME",result); 
		
		
			
	}
	@When ("I Play the Game with number 4")
	public void play2() {
		
		result = oep.play(4);
		
		
	}
	@Then ("The result is EVEN")
	public void result2() {
		
		Assert.assertEquals("EVEN",result); 
		
		
			
	}
	@When ("I Play the Game with number 15")
	public void play3() {
		
		result = oep.play(15);
		
		
	}
	@Then ("The result is ODD")
	public void result3() {
		
		Assert.assertEquals("ODD",result); 
		
		
			
	}

	
	 
}
