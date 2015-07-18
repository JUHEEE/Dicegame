package test;

import static org.junit.Assert.*;

import javax.xml.ws.FaultAction;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dicegame.Dice;
import dicegame.FraudDice;
import dicegame.FraudPlayer;
import dicegame.Judge;
import dicegame.Player;
import dicegame.Recorder;

public class DicegameTest {

	private Dice dice;
	private FraudDice frauddice;
	private FraudPlayer fraudplayer;
	private Judge judge;
	private Recorder recorder;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dice = new Dice();
		frauddice = new FraudDice();
		judge = new Judge();
		fraudplayer = new FraudPlayer();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDice() {

		int dicenumber = dice.DiceNumber();

		Assert.assertNotNull(dice);
		// Assert.assertTrue(dicenumber >= 1 && dicenumber <=6);

		// Assert.assertEquals(5, dicenumber);
	}

	@Test
	public void testFraudDice() {

		Assert.assertNotNull(frauddice);

		int fraudnormal = frauddice.DiceNumber("NORMAL");
		Assert.assertTrue(fraudnormal >= 1 && fraudnormal <= 6);

		int fraudweak = frauddice.DiceNumber("WEAK");
		Assert.assertTrue(fraudweak >= 1 && fraudweak <= 2);

		int fraudstrong = frauddice.DiceNumber("STRONG");
		Assert.assertTrue(fraudstrong >= 5 && fraudstrong <= 6);
		
	}
	
	@Test
	public void testJudge(){
		
		Assert.assertNotNull(judge);
		Assert.assertNotNull(fraudplayer);
	
		String mode = judge.Mode();
		Assert.assertTrue(mode =="STRONG" || mode == "WEAK" || mode == "NORMAL");
	}

}
