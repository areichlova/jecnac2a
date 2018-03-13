package zoo;

import java.util.ArrayList;

/**
 * Entry class
 * @author alicek
 * @version 1.0
 */
public class Main {
	 

	public static void main(String[] args) {
		ArrayList<AnimalInterface> animals = new ArrayList<>();
		
		System.out.println("Ščančar mi dluží prachy, berušky.");
		
		animals.add(new Lenochod());
			
		animals.add(new Yeti());
		animals.add(new Hroch(269,2.5));
		
		animals.add(new Fenek(1.2));
		for(AnimalInterface anim : animals) {
			System.out.println(anim.whoAmI()+": "+anim.doSound());
		}
	}

}
