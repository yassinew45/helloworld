package helloworld;

import java.util.Scanner;

public class CalculatorOOP {
	
	String version;
	
	public CalculatorOOP(String version){
		this.version = version;
	}
	
	public void addition(double a, double b){
		System.out.print(a + " + " + b + " = " + (a+b));
	}
	
	public void subtraction(double a, double b){
		System.out.print(a + " - " + b + " = " + (a-b));
	}
	
	public void multiplication(double a, double b){
		System.out.print(a + " * " + b + " = " + (a*b));
		
	}
	
	public void division(double a, double b){
		System.out.print(a + " / " + b + " = " + (a/b));
	}

	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char operation, continua;
		double number1, number2;
		
		CalculatorOOP Cal = new CalculatorOOP("v1.1");
		
		do{
			System.out.println("Welcome to the calculator App! version " + Cal.version);
			System.out.println("Please, select which operation you want to perform: ");
			System.out.print("['+' for addition, '-' for subtraction, '*' for multiplication, '/' for division] :: ");
			operation = input.next().charAt(0);
			
			if (operation != '+' && operation != '-' && operation != '*' && operation != '/')
				System.out.print("Wrong input!");
			
			else{
				System.out.print("Now, provide the two number for the operation (order matters!!): ");
				number1 = input.nextDouble();
				number2 = input.nextDouble();
			
				switch(operation){
					case '+':
						Cal.addition(number1, number2);
						break;
					
					case '-':
						Cal.subtraction(number1, number2);
						break;
						
					case '*':
						Cal.multiplication(number1, number2);
						break;
						
					case '/':
						Cal.division(number1, number2);
						break;
						
					default:
						System.out.print("Wrong input!");
					
				}
			}
			
			System.out.print("\nEnter 'y' or 'Y' to go again, or any other key to quit: ");
			continua = input.next().charAt(0);
			
		}while(continua == 'y' || continua == 'Y');
		
		input.close();
		

	}

}
