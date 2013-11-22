package bjorklubburinn.tictactoe;

import static spark.Spark.*;
import spark.*;

public class Tictactoe
{
	// Stores the values of the tictactoe table.
	// Will be displayed in a html table.
	// Initialized by resetTickTackArray().
	public static String[] tickTack;

	// This counter determines whether it is X or Os turn.
	// Initialized by resetTickTackArray().
	public static int turnCounter;

	// Resets tickTack so it only contains radio buttons used in html.
	public static String[] resetTickTackArray()
	{
		// if turnCounter starts at 0, X will make the first move.
		turnCounter = 0;

		int count = 0;
		String[] tempTack = new String[9];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 9; i++)
		{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				tempTack[i] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
		}

		return tempTack;
	}

	public static boolean checkForVictory(String[] victoryTickTack)
	{
		if (victoryTickTack[0] == victoryTickTack[1] && victoryTickTack[1] == victoryTickTack[2])
			return true;

		return false;
	}


	public static void main(String[] args)
	{
		// setting tickTack to a default setting.
		tickTack = resetTickTackArray();

		// Default homepage.
		get(new Route("/") 
	  	{
	 	 	@Override
	      	public Object handle(Request request, Response response) 
	      	{
	      		// A string that will store a html code that will be viewed when "/" is requested.
	      		StringBuilder welcome = new StringBuilder();

	      		welcome.append("<DOCTYPE!>")
						.append("<html>")
						.append("<head>")
						.append("<title>TickTackToe</title>")
						.append("</head>")
						.append("<body>")
						.append("<h1>Welcome to this Java Spark test site</h1>")
						.append("<p>This is still a work in progress</p>")
						.append("<a href=\"http://localhost:4567/tick\">Play TickTackToe</a>")
						.append("</body>")
						.append("</html>");

	      	   return welcome;
	      	}
	 	});

		// A view where the  player can play Tictactoe.
	 	get(new Route("/tick") 
	  	{
	     	@Override
	      	public Object handle(Request request, Response response) 
	      	{
	      		// A string that will store a html code that will be viewed when "/tick" is requested.
	      		StringBuilder output = new StringBuilder();
				
				output.append("<form id='tick-submit' method='POST' action='/tick'>")

						.append("<table border=\"1\"><tr>")
						.append("<td>" + tickTack[0] + "</td>")
						.append("<td>" + tickTack[1] + "</td>")
						.append("<td>" + tickTack[2] + "</td>")
						.append("</tr>")
						.append("<tr>")
						.append("<td>" + tickTack[3] + "</td>")
						.append("<td>" + tickTack[4] + "</td>")
						.append("<td>" + tickTack[5] + "</td>")
						.append("</tr>")
						.append("<tr>")
						.append("<td>" + tickTack[6] + "</td>")
						.append("<td>" + tickTack[7] + "</td>")
						.append("<td>" + tickTack[8] + "</td>")
						.append("</tr>")
						.append("</table>")
						.append("</form>")
				
						.append("<input type=\"submit\" value=\"Choose\" form=\"tick-submit\" />")
						.append("<a href=\"http://localhost:4567/reset\">Reset game</a>");

						if (checkForVictory(tickTack))
						output.append("<h1>WINNER!</h1>");

	       		return output;
	      	} 
	 	});

		// This request is called when the submit button in /tick is pushed.
		post(new Route("/tick")
		{
			@Override
			public Object handle(Request request, Response response) 
			{
				// This variable grabs the values of the raido buttons stored in the tickTack array.
				int square = Integer.parseInt(request.queryParams("boardValues"));

				// A selected radio button affects a corresponding element in the array.
				// The radio button is then erased and an X or an O is put there insted.
				if (turnCounter % 2 == 0)
				{
		            tickTack[square] = "X";
		        	turnCounter++;
		        }
		        else
		        {
		            tickTack[square] = "O";
		            turnCounter++;
		        }

         		// Sends an OK status to the browser
             	response.status(201);
                response.redirect("/tick");

                return "";
			}
		});

		// This request resets the game board
		get(new Route("/reset") 
	  	{
	     	@Override
	      	public Object handle(Request request, Response response) 
	      	{
	      		tickTack = resetTickTackArray();
	      		response.redirect("/tick");	
	       		return "";
	      	} 
	 	});
	}
}