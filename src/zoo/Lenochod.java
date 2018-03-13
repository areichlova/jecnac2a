/**
 * 
 */
package zoo;

/**
 * @author sevcik3
 * @version 1.1
 */
public class Lenochod implements AnimalInterface{
	
	/**
	 * Mass of animal
	 */
	private double weight;	

	@Override
	public double getWeight() {
			double weight = 0.0;
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		if( weight < 0) {
			System.out.println("Negative value");
		}
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		return weight * 0.5;
	}

	@Override
	public String doSound() {
		String text ="";
		return text;
	}

	@Override
	public String whoAmI() {
		String text = "";
		return text;
	}

	

}
