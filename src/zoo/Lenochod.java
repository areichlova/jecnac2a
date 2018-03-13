/**
 * 
 */
package zoo;

/**
 * @author sevcik3
 * @version 1.4
 */
public class Lenochod implements AnimalInterface{
	
	/**
	 * Mass of animal
	 */
	private double weight;	
	
	public Lenochod(double weight) {
		if(weight < 0) {
			System.out.println("Wrong value of weight");
			return;
		}
		this.weight = weight;
	}
	
	
	
	/**
	 * Getter for Weight of Sloth 
	 * @return weight
	 */
	@Override
	public double getWeight() {
		return weight;
	}

	/**
	 * Set weight of Sloth
	 */
	@Override
	public void setWeight(double weight) {
		if( weight < 0) {
			System.out.println("Negative value");
		}
		this.weight = weight;
	}
	
	/**
	 * @return food consuption
	 */
	@Override
	public double foodConsumption() {
		return weight * 0.5;
	}
	
	/**
	 * Sound of Animal
	 * @return sound of animal
	 */
	@Override
	public String doSound() {
		String text = "zzzz... Ščančar mi dluží prachy... zzz";
		return text;
	}

	/**
	 * Returns string of who I am
	 * @return who Am I?
	 */
	@Override
	public String whoAmI() {
		String text = "Lenochod (Sloth)";
		return text;
	}

	

}
