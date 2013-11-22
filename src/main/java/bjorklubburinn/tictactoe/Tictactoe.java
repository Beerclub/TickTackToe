package bjorklubburinn.tictactoe;

import static spark.Spark.*;
import spark.*;

public class Tictactoe
{
	// Stores the values of the tictactoe table
	// Will be displayed in a html table
	public static String[][] tickTack = new String[3][3];
	
	public static void main(String[] args)
	{
		int count = 0;

		// Adds a html radio button to every positon of the array.
		// count adds a different value to each radio button so each button has a different value.
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				tickTack[i][j] = "<input type=\"radio\" name=\"boardValues\" value=\"" + count + "\">";
				count++;
			}
		}

		// Default homepage 
		get(new Route("/") 
	  	{
	 	 	@Override
	      	public Object handle(Request request, Response response) 
	      	{
	      		// A string that will store a html code that will be viewed when "/" is requested
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


	}
}