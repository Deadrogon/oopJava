package Homework;

public class Pitagorasz {

	public static void main(String[] args) {
		
		/*
		 * 2. 1 �s 100 k�z�tti sz�mokb�l k�pezz�k a Pitagoraszi sz�mh�rmasokat �s �rjuk ki t�bl�zatos form�ban 
			(megold�s: 14 ilyen sz�mh�rmas van). A Pitagoraszi sz�mh�rmasok egy der�ksz�g� h�romsz�g oldalainak eg�sz m�r�sz�mai, 
			azaz teljes�l r�juk, hogy a2 + b2 = c2.
		 */
		
		int no = 0;
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				for (int k = 1; k < 100; k++) {
					if (((i*i) + (j*j)) == (k*k) && (i<=j)) {
						no++;
						System.out.println(no + ". i = " + i + ", j = " + j + ", k = " + k);
					}
				}
			}
		}
		
		/* T�bb, mint 14 ilyen sz�mh�rmas van!*/
		
	}

}
