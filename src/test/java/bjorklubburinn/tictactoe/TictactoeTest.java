package bjorklubburinn.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TictactoeTest
{
	@Test
	public void testresetTickTackArray()
	{
		int count = 0;

		String[][] testTack = new String[3][3];

		// Sets tickTack array to default settings
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				testTack[i][j] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
			}
		}

		assertEquals(testTack, Tictactoe.resetTickTackArray());
	}

}
