package zoo;

import java.util.ArrayList;

/**
 * Entry class

 * @author alik
 * @version 1.1
 */
public class Main {

	
	//Zde jsem n�co napsal.
	

	 


	public static void main(String[] args) {
		ArrayList<AnimalInterface> animals = new ArrayList<>();
		

		//Zde vytvorte objekt sve tridy a vlozte ho do ArrayListu

		System.out.println("Ščančar mi dluží prachy, berušky.");
		
		animals.add(new Lenochod());

			
		animals.add(new Yeti());	
		animals.add(new Yeti());
		animals.add(new Hroch(269,2.5));
		animals.add(new Kun());
		

		animals.add(new Fenek(1.2));
		for(AnimalInterface anim : animals) {
			System.out.println(anim.whoAmI()+": "+anim.doSound());
		}
	}

}
