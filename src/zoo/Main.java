package zoo;

import java.util.ArrayList;

/**
 * Entry class
 * @author alik
 * @version 1.0
 */
public class Main {
	

	public static void main(String[] args) {
		ArrayList<AnimalInterface> animals = new ArrayList<>();
		
		System.out.println("Ščančar mi dluží prachy, berušky.");
		
		animals.add(new Lenochod());
			
		animals.add(new Yeti());
		
		for(AnimalInterface anim : animals) {
			System.out.println(anim.whoAmI()+": "+anim.doSound());
		}
	}

}
