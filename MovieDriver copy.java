import java.util.Scanner;
//import statement for Scanner class

public class MovieDriver {

	public static void main(String[] args) {
		
		//Create a new object of type Scanner that reads from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//Create a new title objects
		String title;
		String rating;
		String input;
		char answer;
		int soldTickets;
		
		do
		{
		//Prompt the user to enter the title of a title and read in line 
		System.out.println("Enter the title of a title followed by 'Enter'.");
		title = keyboard.nextLine();
		
		//Prompt the user to enter the title’s rating
		System.out.println("Enter the rating of the title followed by 'Enter'.");
		rating = keyboard.nextLine();
		
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Please enter the number of tickets sold at a (unnamed) theater followed by 'Enter'.");
		soldTickets = keyboard.nextInt();
		
		//Print out the information using the movie’s toString method
		Movie bMovie = new Movie(title,rating,soldTickets);
        System.out.println(bMovie);
		
		
		//extra next line to clear up any issues 
		keyboard.nextLine();
		
		//Prompt the user to enter if whether or not they wish to continue
		System.out.println("Do you want to enter another?(y or n)");
		input = keyboard.nextLine();
		answer = input.charAt(0);
		
		
		} while(answer == 'y');
		System.out.println("Goodbye.");
	}
	
	public void printInformation() {
		
		
	}
	
}
