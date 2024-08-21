import java.util.Scanner;
	public class IT24100786Lab4Q1{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int number;
		System.out.println("Enter a Number - ");
		number=input.nextInt();
		if (number==0){
		System.out.println("The number is Zero");}
		else if (number>=0) {
		System.out.println("The number is Positive");}
		else
		{System.out.println("The number is Negative");}
	}
}