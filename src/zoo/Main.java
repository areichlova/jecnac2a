package zoo;

import java.util.ArrayList;

/**
 * Entry class
 * @author alik
 * @version 1.0
 */
public class Main {
	
	//Zde jsem nìco napsal.
	

	public static void main(String[] args) {
		ArrayList<AnimalInterface> animals = new ArrayList<>();
		
		//Zde vytvorte objekt sve tridy a vlozte ho do ArrayListu
		
		for(AnimalInterface anim : animals) {
			System.out.println(anim.whoAmI()+": "+anim.doSound());
		}
	}

}
