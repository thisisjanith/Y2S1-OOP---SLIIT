public class ex1{
public static void main(String [] args){
	
	int miles,yards;
	double kilometers;
	
	miles = 26;
	yards = 385;
	
	kilometers = (miles * 1.609) + (yards / 1760.0);
	
	System.out.println("Distance = " + kilometers + "in Kilometers");
	
}
}
