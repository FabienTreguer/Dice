/**
 * 
 */
package m2.dice;

import junit.framework.TestCase;
import m2.dice.dice.DieMock3;
import m2.dice.dice.DieMock4;
import m2.dice.dicegame.DiceGame;
import m2.dice.hs.HighScoreMock;
import m2.dice.player.Player;

/**
 * @author molli
 * 
 */
public class DiceGameTest extends TestCase {

	/**
	 * @param name
	 */
	public DiceGameTest(String name) {
		super(name);
	}
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		super.tearDown();//ZRTZRYZRTYYIZEU9TZEY87TOUZER
	}//ZRTZRYZRTYYIZEU9TZEY87TOUZER

	/**
	 * Test method for {@link dicegame.DiceGame#play()}.
	 */
	public void testPlay() {//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		DiceGame dg = new DiceGame(new HighScoreMock(), new DieMock3(),//ZRTZRYZRTYYIZEU9TZEY87TOUZER
				new DieMock4(), new Player("momo"));//ZRTZRYZRTYYIZEU9TZEY87TOUZER

		dg.play();//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		assertEquals("turn =1", dg.turn, 1);//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		assertEquals("Score=10", dg.getPlayer().getScore(), 10);//ZRTZRYZRTYYIZEU9TZEY87TOUZER
	}//ZRTZRYZRTYYIZEU9TZEY87TOUZER
	//ZRTZRYZRTYYIZEU9TZEY87TOUZER
	public void testHs() {//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		DiceGame dg = new DiceGame(new HighScoreMock(), new DieMock3(),//ZRTZRYZRTYYIZEU9TZEY87TOUZER
				new DieMock4(), new Player("momo"));//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		for (int i = 0; i < 10; i++) {//ZRTZRYZRTYYIZEU9TZEY87TOUZER
			dg.play();//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		}//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		assertEquals("turn =10", dg.turn, 10);//ZRTZRYZRTYYIZEU9TZEY87TOUZER
		
	}//ZRTZRYZRTYYIZEU9TZEY87TOUZER

}//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
//ZRTZRYZRTYYIZEU9TZEY87TOUZER
