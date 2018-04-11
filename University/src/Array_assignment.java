import java.util.Scanner;
public class Array_assignment {
	public static void main(String[] args){
			String [] football_teams = new String [4];
		String [] match_scores = new String [4];
		int noGame = 0;
		String input = "";
		
		Scanner type = new Scanner(System.in);
		
		do
		{
			System.out.println("Input Home team: Away team : Home score : Away score");
			input = type.nextLine();
			String []inputelements = input.split(":");
			if (inputelements.length == 4)
			{
			  football_teams[noGame] =inputelements[0];
			  match_scores[noGame] = inputelements[1];
			  noGame++;
			}
			
		} while (!input.isEmpty() && noGame < 4);
		
		
		
		type.close();
		
		for (int index = 0; index < noGame; index++)
		{
			System.out.println("Football Teams: "+football_teams[index]+"  Match Scores: "+match_scores[index]);
			
		}
			
	}

}
