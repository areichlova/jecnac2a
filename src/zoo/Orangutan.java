package zoo;
/**
 * 
 * @author kolman
 *
 */

public class Orangutan implements AnimalInterface {

	private double weight;
	private int height;
	
	public Orangutan(double weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	@Override
	public void setWeight() {
			
	}
	public double foodConsumption() {
		return weight*2;
	}

	public String doSound() {
		return "Huhuhuhuhuhu";
	}

	public String whoAmI() {
		return "Orangutan Kry�p�n";
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	


}
