package Homework;

public class Euler {

	public static void main(String[] args) {
		
		/*
		 * 1. Adjon közelítést az Euler-féle e számra (e = 2,718 281 828) az alábbi sorozat elsõ 100 / 1000 tagjának kiszámításával.
		 */
		
		double e = 1;
		
		for (double i = 1; i < 10000; i++) {
				e = e + (1/(factor(i)));
		}
			
			System.out.println("A 'e' értéke: " + e);

	}

	private static double factor(double n) {
		double factor=1;
		for (double i = 1; i <= n; i++) {
			factor*=i;
		}
		return factor;
	}
	
	
}
