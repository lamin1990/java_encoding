import java.util.Scanner;

	public class store_array_match_scores 
	{
	//Declare, intialise and assign with static method
		
	static int numberOfmatches = 0;
	static int homeScores = 0;
	static int awayScores = 0;
	static int highestHomeScore = 0;
	static int highestAwayScore = 0;
	static int invalidMatches = 0;


		public static void main(String[] args) 
		{
			//declare and initialise variables
			String [] football_match = new String [100];
			int counter = 0;
			
			Scanner input = new Scanner(System.in);
			System.out.println("Input Home team: Away team : Home score : Away score ");
			
			// begin read lines 
			while (input.hasNextLine()) 
			{
				String line = input.nextLine().trim();	//check for blank spaces
				if(line.isEmpty()){		//if there is space ignore
					continue;			// continue with rest of program
				}
				if (line.toLowerCase().equals("stop")) //exit when stop is entered
				{
						break;
				} else {
					football_match[counter] = line;
				
				}
			counter++;	
			
			}
			// end read lines 
			
			input.close();	// Close Scanner
			
			// begin validate 
			
			for ( int i = 0; i < counter; i++ ) 
			{
				// check if elements contains a Colon and which line contains the error
				
				if (!football_match[i].contains(":")) 
				{
					System.out.println(String.format("No or invalid delimiter used in " + football_match[i]));
					invalidMatches++;
					continue;
				}
				// Split the Array Elements with colon and avoid trailing elements been ignored 
				
				String [] elements = football_match[i].split(":", -1);
				
				// check if the elements after split is not less than 4 or greater
				 																		
				
				if (elements.length != 4) // check if elements is not less than 4
				{
					System.out.println("Incorrect number of elements");

					invalidMatches++;
					continue;
				}
			
				// Declare and Initialise array elements
				 										
					String homeTeamName = elements[0];
					
					// Validate and check if home team is missing or empty 
					 												
					if(homeTeamName == null || homeTeamName.isEmpty())
					{
						System.out.println("The homeTeam may be missing");
						invalidMatches++;
						continue;
					
					}
					//Declare an initialise array elements
					 										
					String awayTeamName = elements[1];
					//Check if away team name is missing or empty
					if(awayTeamName == null || awayTeamName.isEmpty()){
						System.out.println("The away team may be missing");
						invalidMatches++;
						continue;
					}
					//Declare and initialise array elements
					String homeTeamScore = elements[2];
					//check if home team score is missing or empty
					if(homeTeamScore == null || homeTeamScore.isEmpty())
					{
						System.out.println("The home team score may be missing");
						invalidMatches++;
						continue;
					}
					
					String awayTeamScore = elements[3];
					
					//check if away teams score is missing or empty
					if(awayTeamScore == null || awayTeamScore.isEmpty())
					{
						System.out.println("The away team score may be missing");
						invalidMatches++;
						continue;	
					}
					int homeScore = 0;
				try{
						homeScore = Integer.parseInt(homeTeamScore);//Attempt to convert the string into an integer
					}
				catch (NumberFormatException e)
					{								//The string did not parse for some reason
						System.out.println("Home team score may not be a valid integer");
						invalidMatches++;
						continue;
					}
					
					
					int awayScore = 0;
				try{
						awayScore = Integer.parseInt(awayTeamScore);//Attempt to convert the string into an integer
					}
				catch (NumberFormatException e)
					{
						System.out.println("Away team score may not be a valid integer");
						invalidMatches++;
						continue;
					}
					
					System.out.println(homeTeamName + " [" + homeTeamScore + "] | " + awayTeamName + " [" + awayTeamScore + "]");
					
					numberOfmatches++; //Match counter
					//Assigning variables and adding home/awayscore with Zero
					homeScores = homeScores + homeScore;
					awayScores = awayScores + awayScore;
					
					
					if (homeScore > highestHomeScore) 
					{
						highestHomeScore = homeScore;
					}
					
					if (awayScore > highestAwayScore)
					{
						highestAwayScore = awayScore;
					}
					
					
							
			}
			// end validation 
			
			// Print Report 
			
			System.out.println("\nTotal");
			System.out.println("------------------------------------------------------");
			System.out.println("Total number of matches played: " + numberOfmatches);
			System.out.println("Total home score: " + homeScores);
			System.out.println("Total away score: " + awayScores);
			System.out.println("Highest home score: " + highestHomeScore);
			System.out.println("Highest away score: " + highestAwayScore);
			System.out.println("inavalid entries: " + invalidMatches);
			
			// begin print 
		
			{
				
			}
			//end print
				
				System.out.println(" ");
		}
	}
		
