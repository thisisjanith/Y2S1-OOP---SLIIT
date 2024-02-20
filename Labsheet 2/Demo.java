public class Demo{
public static void main(String [] args){

EvenOddNumber num = new EvenOddNumber();
boolean result = num.findEvenOrOdd(6);

if(result == true){
	System.out.println("This is an even number");
}
else{
	System.out.println("This is an odd number");
	
}
}
}