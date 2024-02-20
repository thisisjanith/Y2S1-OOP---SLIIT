import java.io.*; 
public class ex4{
	public static void main(String[] args) throws IOException{
		
			int length, width, height, volume;

InputStreamReader isr = new InputStreamReader(System.in);  //Object of InputStreamReader
BufferedReader br = new BufferedReader(isr); //Object of BufferedReader
	
		
		System.out.println("Enter Length:   ");
		length = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Width:   ");
		width = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Height:    ");
		height = Integer.parseInt(br.readLine());
		
		
		volume = length * width * height;
		
		System.out.println("Volume of the cube is: " + volume);
	}
}
		
	