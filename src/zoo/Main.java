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
			
		animals.add(new Yeti());
		animals.add(new Hroch(269,2.5));
		
		for(AnimalInterface anim : animals) {
			System.out.println(anim.whoAmI()+": "+anim.doSound());
		}
	}

}
