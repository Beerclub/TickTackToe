package bjorklubburinn.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TictactoeVictoryTest
{
	// X|X|X
	// -----
	//  | |
	// -----
	//  | | 

	@Test
	public void testCheckForVictory012()
	{
		int count = 0;
		String[] testTack = new String[9];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 9; i++)
		{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
		}

		testTack[0] = "X";
		testTack[1] = "X";
		testTack[2] = "X";

		assertEquals(true, Tictactoe.checkForVictory(testTack));
	}


	//  | |
	// -----
	// X|X|X
	// -----
	//  | | 

	@Test
	public void testCheckForVictory345()
	{
		int count = 0;
		String[] testTack = new String[9];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 9; i++)
		{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
		}

		testTack[3] = "X";
		testTack[4] = "X";
		testTack[5] = "X";

		assertEquals(true, Tictactoe.checkForVictory(testTack));
	}


	//  | |
	// -----
	//  | | 
	// -----
	// X|X|X

	@Test
	public void testCheckForVictory678()
	{
		int count = 0;
		String[] testTack = new String[9];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 9; i++)
		{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
		}

		testTack[6] = "X";
		testTack[7] = "X";
		testTack[8] = "X";

		assertEquals(true, Tictactoe.checkForVictory(testTack));
	}


	// X| |
	// -----
	// X| | 
	// -----
	// X| | 

	@Test
	public void testCheckForVictory036()
	{
		int count = 0;
		String[] testTack = new String[9];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 9; i++)
		{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
		}

		testTack[0] = "X";
		testTack[3] = "X";
		testTack[6] = "X";

		assertEquals(true, Tictactoe.checkForVictory(testTack));
	}


	//  |X|
	// -----
	//  |X| 
	// -----
	//  |X| 

	@Test
	public void testCheckForVictory147()
	{
		int count = 0;
		String[] testTack = new String[9];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 9; i++)
		{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
		}

		testTack[1] = "X";
		testTack[4] = "X";
		testTack[7] = "X";

		assertEquals(true, Tictactoe.checkForVictory(testTack));
	}


	//  |X|
	// -----
	//  |X| 
	// -----
	//  |X| 

	@Test
	public void testCheckForVictory258()
	{
		int count = 0;
		String[] testTack = new String[9];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 9; i++)
		{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
		}

		testTack[2] = "X";
		testTack[5] = "X";
		testTack[8] = "X";

		assertEquals(true, Tictactoe.checkForVictory(testTack));
	}


	// X| |
	// -----
	//  |X| 
	// -----
	//  | |X

	@Test
	public void testCheckForVictory048()
	{
		int count = 0;
		String[] testTack = new String[9];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 9; i++)
		{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
		}

		testTack[0] = "X";
		testTack[4] = "X";
		testTack[8] = "X";

		assertEquals(true, Tictactoe.checkForVictory(testTack));
	}

	// X| |
	// -----
	//  |X| 
	// -----
	//  | |X

	@Test
	public void testCheckForVictory246()
	{
		int count = 0;
		String[] testTack = new String[9];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 9; i++)
		{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
		}

		testTack[2] = "X";
		testTack[4] = "X";
		testTack[6] = "X";

		assertEquals(true, Tictactoe.checkForVictory(testTack));
	}
}