package bjorklubburinn.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TictactoeTest
{
	@Test
	public void testResetTickTackArray()
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

		assertEquals(testTack, Tictactoe.resetTickTackArray());
	}
}
