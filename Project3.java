// Ezra Felix and Cade Eidsvoog
import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	
	
	System.out.println("Enter the name of the yarn specified by your pattern.");
	
    String name1 = keyboard.nextLine();
    
    System.out.println("Enter the number of balls of " + name1 + " that are required.");
    
    int numBalls = keyboard.nextInt();
    
   System.out.println("Enter the number of yards per ball of " + name1 + "." );
   
   int numYards = keyboard.nextInt();
   
   keyboard.nextLine();
   
   System.out.println("Enter the name of the substitute yarn.");
   
   String name2 = keyboard.nextLine();
   
   System.out.println("Enter the number of yards per ball of " + name2 + ".");
   
     int numYardsSub = keyboard.nextInt(); 
     
   
     double numSubBalls = (double) ( numBalls * numYards ) / numYardsSub ;
     
     int result = (int)Math.ceil(numSubBalls);
     
     System.out.println("You should purchase " + result + " balls of " + name2 + " instead of " + numBalls + " balls of " + name1 + ".");
   
      
		keyboard.close();
	}

}
