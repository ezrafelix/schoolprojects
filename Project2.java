// Ezra Felix and Cade Eidsvoog
public class Project2 
{
public static void main(String[] args)
{
	String name1 = "Three Sisters, Bi Feiyu";
	String name2 = "Song Of Solomon, Toni Morrison";
	String name3 = "Owls Do Not Have To Mean Death, Chip Livingston";
	
	double ThreeSistersCost = 18.99;
	double SongOfSolomonCost = 11.99;
	double OwlsNotDeathCost = 80.50;
	int numThreeSisters = 2;
	int numSongOfSolomon = 4;
	int numOwlsNotDeath = 1;
	final double TAX_RATE = 8.75;
	double preTaxTotal = (ThreeSistersCost * numThreeSisters) + (SongOfSolomonCost * numSongOfSolomon) + (OwlsNotDeathCost * numOwlsNotDeath);
	final double SalesTax = (TAX_RATE / 100) * preTaxTotal;
	double TotalOrderCost = preTaxTotal + SalesTax;
	
    System.out.println("Purchase " + numThreeSisters + " copies of " + name1 + ". Each copy costs $" + ThreeSistersCost + ".");
    System.out.println("Purchase " + numSongOfSolomon + " copies of " + name2 + ". Each copy costs $" + SongOfSolomonCost + ".");
    System.out.println("Purchase " + numOwlsNotDeath + " copy of " + name3 + ". Each copy costs $" + String.format("%.2f", OwlsNotDeathCost) + ".");
    System.out.println("Total before tax: $" + preTaxTotal);
    System.out.println("Sales tax: $" + String.format("%.2f", SalesTax));
    System.out.println("The total cost of your order will be $" + String.format("%.2f", TotalOrderCost));
}
}
