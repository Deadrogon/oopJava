package iit.uni.miskolc.hu.oop;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] array = new int[5];
		
		/*for (int i = 0; i < array.length; i++) {
			try {
				array[i] = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("nem szám...");
			}
			
		}
		*/
		/*for (int i = 0; i < array.length; i++) {
			try {
				array[i] = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("nemszam");
			}
			
		}
		*/
		
		for (int i = 0; i < array.length; i++) {
			try {
				array[i]=readFromConsole();
			} catch (IllegalArgumentException e) {
				System.out.println("nem poz szam");
			}  
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
	}

	public static int readFromConsole() throws IllegalArgumentException {
		int number=0;
		while (true){
			try {
				number = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("nemszam");
			}
		}
		if (number < 1) {
			throw new IllegalArgumentException();
		}
		if(notPrime(number)){
			throw new NotPrimException();
		}
		return number;
	}
	
	private static boolean notPrime(int number){
		for (int i = 2; i < number; i++) {
			if(number % i ==0)
				return false;
		}
		return true;
	}
	
}
