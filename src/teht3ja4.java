
import java.util.Scanner;

public class teht3ja4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Width?");
		int widthinput = Integer.parseInt(in.nextLine());
		System.out.println("Lenght?");
		int lenghtinput = Integer.parseInt(in.nextLine());
		Utils.areaCalc(widthinput, lenghtinput);
		System.out.println("Area is " + Utils.areaCalc(widthinput, lenghtinput));

	}

}
class Utils{
	
	public static void printTitle()
	{
		System.out.println("*******");
		System.out.println("* OOP *");
		System.out.println("*******");
	}
	
	public static int areaCalc(int width, int lenght)
	{
	
		return width*lenght;
	}
	 
}