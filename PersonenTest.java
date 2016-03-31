package A20;

import org.junit.*;
import weiser.LKW;
import weiser.PersonenException;
import static org.junit.Assert.*;
//git@github.com:n1ko12333/A20-BlackBoxTest.git
public class PersonenTest {
	
	LKW l1;
	
	@Before
	public void testBefore(){
		l1 = new LKW("KGNW23", 5000, 450, 3);
	}
	
	@Test(expected=PersonenException.class)
	public void testAussteigen(){
		l1.aussteigen();
	}
	
	@Test(expected=PersonenException.class)
	public void testEinsteigen(){
		l1.einsteigen();
		l1.einsteigen();
		l1.einsteigen();
		l1.einsteigen();
		l1.einsteigen();
		l1.einsteigen();
	}
	
	@Test
	public void testHoechstZulaessigePersonenZahl(){
		assertEquals(3, l1.getHoechstZulaessigePersonenZahl());
	}

}


