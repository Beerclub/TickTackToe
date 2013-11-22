package bjorklubburinn.tictactoe;

import static spark.Spark.*;
import spark.*;

public class Tictactoe
{
	// Stores the values of the tictactoe table.
	// Will be displayed in a html table.
	public static String[][] tickTack;

	// This counter determines whether it is X or Os turn.
	public static int turnCounter = 0;

	// Resets tickTack so it only contains radio buttons used in html.
	public static String[][] resetTickTackArray()
	{
		int count = 0;

		String[][] tempTack = new String[3][3];

		// Sets tickTack array to default settings.
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				// Adds a html radio button to every positon of the array.
				// count adds a different value to each radio button so each button has a different value.
				tempTack[i][j] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
			}
		}

		return tempTack;
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
						.append("<td>" + tickTack[0][0] + "</td>")
						.append("<td>" + tickTack[0][1] + "</td>")
						.append("<td>" + tickTack[0][2] + "</td>")
						.append("</tr>")
						.append("<tr>")
						.append("<td>" + tickTack[1][0] + "</td>")
						.append("<td>" + tickTack[1][1] + "</td>")
						.append("<td>" + tickTack[1][2] + "</td>")
						.append("</tr>")
						.append("<tr>")
						.append("<td>" + tickTack[2][0] + "</td>")
						.append("<td>" + tickTack[2][1] + "</td>")
						.append("<td>" + tickTack[2][2] + "</td>")
						.append("</tr>")
						.append("</table>")
						.append("</form>")
				
						.append("<input type=\"submit\" value=\"Choose\" form=\"tick-submit\" />");

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
				switch (square) 
				{
		            case 0:	if (turnCounter % 2 == 0)
		            			tickTack[0][0] = "X";
		            		else
		            			tickTack[0][0] = "O";
		            		turnCounter++;
		                    break;
		            case 1: if (turnCounter % 2 == 0)
		            			tickTack[0][1] = "X";
		            		else
		            			tickTack[0][1] = "O";
		            		turnCounter++;
		                    break;
		            case 2: if (turnCounter % 2 == 0)
		            			tickTack[0][2] = "X";
		            		else
		            			tickTack[0][2] = "O";
		            		turnCounter++;
		                    break;
		            case 3: if (turnCounter % 2 == 0)
		            			tickTack[1][0] = "X";
		            		else
		            			tickTack[1][0] = "O";
		            		turnCounter++;
		                    break;
		            case 4: if (turnCounter % 2 == 0)
		            			tickTack[1][1] = "X";
		            		else
		            			tickTack[1][1] = "O";
		            		turnCounter++;
		                    break;
		            case 5: if (turnCounter % 2 == 0)
		            			tickTack[1][2] = "X";
		            		else
		            			tickTack[1][2] = "O";
		            		turnCounter++;
		                    break;
		            case 6: if (turnCounter % 2 == 0)
		            			tickTack[2][0] = "X";
		            		else
		            			tickTack[2][0] = "O";
		            		turnCounter++;
		                    break;
		            case 7: if (turnCounter % 2 == 0)
		            			tickTack[2][1] = "X";
		            		else
		            			tickTack[2][1] = "O";
		            		turnCounter++;
		                    break;
		            case 8: if (turnCounter % 2 == 0)
		            			tickTack[2][2] = "X";
		            		else
		            			tickTack[2][2] = "O";
		            		turnCounter++;
		                    break;
         		}

         		// Sends an OK status to the browser
             	response.status(201);
                response.redirect("/tick");

                return "";
			}
		});

	}
}