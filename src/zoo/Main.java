package zoo;

import java.util.ArrayList;

/**
 * Entry class
 * @author alik
 * @version 1.1
 */
public class Main {
<<<<<<< HEAD
	
	//Zde jsem n�co napsal.
	
=======
	 
>>>>>>> branch 'master' of https://github.com/areichlova/jecnac2a.git

	public static void main(String[] args) {
		ArrayList<AnimalInterface> animals = new ArrayList<>();
		
<<<<<<< HEAD
		//Zde vytvorte objekt sve tridy a vlozte ho do ArrayListu
=======
		System.out.println("Ščančar mi dluží prachy, berušky.");
		
		animals.add(new Lenochod());
			
		animals.add(new Yeti());
		animals.add(new Hroch(269,2.5));
>>>>>>> branch 'master' of https://github.com/areichlova/jecnac2a.git
		
		for(AnimalInterface anim : animals) {
			System.out.println(anim.whoAmI()+": "+anim.doSound());
		}
	}

}
