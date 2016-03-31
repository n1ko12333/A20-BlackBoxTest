package A20;

import org.junit.*;
import weiser.GewichtException;
import weiser.LKW;
import static org.junit.Assert.*;
//git@github.com:n1ko12333/A20-BlackBoxTest.git
public class GewichtTest {

	LKW l1;
	
	@Before
	public void testBefore(){
		l1 = new LKW("KGNW23", 5000, 450, 3);
	}
	
	@Test
	public void testAufladen1(){
		l1.aufladen(1800);
	}
	
	@Test(expected=GewichtException.class)
	public void testAufladen2(){
		l1.aufladen(80000);
	}
	
	@Test(expected=GewichtException.class)
	public void testEntladen1(){
		l1.entladen(1700);
	}
	
	@Test(expected=GewichtException.class)
	public void testEntladen2(){
		l1.entladen(80000);
	}
	
	@Test
	public void testHoechstZulaessigesGesamtGewicht(){
		assertEquals(5000, l1.getHoechstZulaessigesGesamtGewicht());
	}

}
