package bjorklubburinn.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TictactoeRemoveButtonsTest
{

	// X|X|X
	// -----
	// O|O|
	// -----
	//  | | 

	@Test
	public void testRemoveButtonsIfVictory012()
	{
		int count = 0;
		String[] testTack = new String[9];

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

		testTack[3] = "O";
		testTack[4] = "O";


		String[] outputTestTack = new String[9];
		outputTestTack[0] = "X";
		outputTestTack[1] = "X";
		outputTestTack[2] = "X";

		outputTestTack[3] = "O";
		outputTestTack[4] = "O";
		outputTestTack[5] = "-";

		outputTestTack[6] = "-";
		outputTestTack[7] = "-";
		outputTestTack[8] = "-";

		assertEquals(outputTestTack, Tictactoe.removeButtonsIfVictory(testTack));

	}

	// O|O|
	// -----
	// X|X|X
	// -----
	//  | | 

	@Test
	public void testRemoveButtonsIfVictory345()
	{
		int count = 0;
		String[] testTack = new String[9];

		for (int i = 0; i < 9; i++)
		{
			// Adds a html radio button to every positon of the array.
			// count adds a different value to each radio button so each button has a different value.
			testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
			count++;
		}

		testTack[0] = "O";
		testTack[1] = "O";

		testTack[3] = "X";
		testTack[4] = "X";
		testTack[5] = "X";


		String[] outputTestTack = new String[9];
		outputTestTack[0] = "O";
		outputTestTack[1] = "O";
		outputTestTack[2] = "-";

		outputTestTack[3] = "X";
		outputTestTack[4] = "X";
		outputTestTack[5] = "X";

		outputTestTack[6] = "-";
		outputTestTack[7] = "-";
		outputTestTack[8] = "-";

		assertEquals(outputTestTack, Tictactoe.removeButtonsIfVictory(testTack));

	}


	// X|O|X
	// -----
	//  |O|X
	// -----
	// O| |X 

	@Test
	public void testRemoveButtonsIfVictory258()
	{
		int count = 0;
		String[] testTack = new String[9];

		for (int i = 0; i < 9; i++)
		{
			// Adds a html radio button to every positon of the array.
			// count adds a different value to each radio button so each button has a different value.
			testTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
			count++;
		}

		testTack[0] = "X";
		testTack[1] = "O";
		testTack[2] = "X";

		
		testTack[4] = "O";
		testTack[5] = "X";

		testTack[6] = "O";
		testTack[8] = "X";


		String[] outputTestTack = new String[9];
		outputTestTack[0] = "X";
		outputTestTack[1] = "O";
		outputTestTack[2] = "X";

		outputTestTack[3] = "-";
		outputTestTack[4] = "O";
		outputTestTack[5] = "X";

		outputTestTack[6] = "O";
		outputTestTack[7] = "-";
		outputTestTack[8] = "X";

		assertEquals(outputTestTack, Tictactoe.removeButtonsIfVictory(testTack));

	}
}