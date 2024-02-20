import java.util.Scanner;

public class ex3{
	public static void main (String [] args){
		Scanner scn = new Scanner(System.in);
		
		
		double length, width, height, volume;
		
		System.out.println("Enter Length:   ");
		length = scn.nextDouble();
		
		System.out.println("Enter Width:   ");
		width = scn.nextDouble();
		
		System.out.println("Enter Height");
		height = scn.nextDouble();
		
		
		volume = length * width * height;
		
		System.out.println("Volume of the cube is: " + volume);
		
		
		
		
	}
		
		
	
}