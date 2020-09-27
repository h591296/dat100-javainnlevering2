package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	// a)
	public static void skrivUt(int[] tabell) {
		
		for (int a = 0; a < tabell.length; a++) {
			System.out.println(tabell[a]);
		}
	}
	
	
	
	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		
		for (int b = 0; b < tabell.length; b++) {
			
			if (b != tabell.length-1) {
				
				streng += (tabell[b] + ",");
			}
			else {
				streng += (tabell[b]);
			}
		}
		streng += "]";
		
		return streng;
	}
	

	
	// c)
	public static int summer(int[] tabell) {
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		
		// for-løkke
		for (int c = 0; c < tabell.length; c++) {
			
			sum1 += tabell[c];
		} 
		System.out.println("Summen av tallene i tabellen er: " + sum1 + "\n");
		
		
		// utvidet for-løkke
		for (int c : tabell) {
			
			sum2 += c;
		}
		System.out.println("Summen av tallene i tabellen er: " + sum2 + "\n");
		
		
		//while-løkke
		int c = 0;
		while (c < tabell.length) {
			sum3 += tabell[c];
			c ++;
		}
		System.out.println("Summen av tallene i tabellen er: " + sum3 + "\n");

		return sum1;
	}

	
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean funnet = false; 
		
		int d = 0;
		
		while (!funnet && d < tabell.length) {
			
			 if (tall == tabell[d]) {
                 funnet = true;
			 }
			
			 d ++; 
		}
		
		return funnet;
	}
	
	
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int e = 0; e < tabell.length; e++) {
			
			if (tall == tabell[e]) {
				
				return e;
			}
		}
		
		return -1;

	}

	
	
	// f)
	public static int[] reverser(int[] tabell) {
		
		int nyTabell[] = new int [tabell.length]; 
		
		for(int f = 0, j = tabell.length-1; f < tabell.length; f++, j--) {
				
				nyTabell[f] = tabell[j]; 
		}
		return nyTabell;
	}

	
	
	// g)
	public static boolean erSortert(int[] tabell) {
		
		int g = 0;
		
		boolean sortert = true;
		
		while (sortert && g < tabell.length - 1) {
			if (tabell[g] > tabell[g+1]) {
				sortert = false;
			}
			g++;
		}
		return sortert;
	}

	
	
	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int toLengder = tabell1.length + tabell2.length;
		
		int toTabeller [] = new int [toLengder];
		
		for (int h = 0; h < tabell1.length; h++) {
		
			toTabeller[h] = tabell1[h];
		}
		for (int i = 0; i < tabell2.length; i++) {
			
			toTabeller [tabell1.length + i] = tabell2[i];
		}
		return toTabeller;
		}
	} 
	

