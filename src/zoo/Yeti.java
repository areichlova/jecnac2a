package zoo;

import java.util.Random;

/**
 * Class represents my favorite animal
 * 
 * @author Ondra Mandik <mandik@spsejecna.cz>
 *
 */
public class Yeti implements AnimalInterface {

	private String name = "YETI";
	
	private double weight = Double.MAX_VALUE;
	
	private char [] sounds = {'!','g','r','s'};
	
	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight += weight;

	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String doSound() {
		Random radnom = new Random();
		String generatedSound = "";
		int soundLenght = radnom.nextInt(10) + 10;
		for(int i =0;i<soundLenght;i++) {
			generatedSound += this.sounds[radnom.nextInt(this.sounds.length)];
		}
		return generatedSound;
	}

	@Override
	public String whoAmI() {
		return this.name;
	}

}
