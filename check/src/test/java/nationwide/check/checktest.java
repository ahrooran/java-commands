package nationwide.check;

import org.junit.Test;

import junit.framework.TestCase;



public class checktest extends TestCase {
	
	check c = new check();
	int result = c.add(2,2);{

	@Test
	if (result == 4){
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
}



}
