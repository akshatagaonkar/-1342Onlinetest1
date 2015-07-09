package noDp;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoorTest {

	Door d = new Door();
	
	

	@Test
	public void testGetState() {
		//fail("Not yet implemented");
		assertEquals("Door is opened",d.getState() );
	}

}
