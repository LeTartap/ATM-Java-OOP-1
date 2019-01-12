package jewelry;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int carateColier = 0;
		int carateBratara=0;

		System.out.print("Carate bratara: ");
		carateBratara = scan.nextInt();
		System.out.print("Carate colier: ");
		carateColier = scan.nextInt();
		
		
		Bracelet bratara = new Bracelet(carateBratara);
		Necklace colier = new Necklace(carateColier);
	
		System.out.print("$");
		System.out.println(colier.price()+bratara.price());
		
		
		scan.close();
	}

}
