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
		this.setHeight(height);
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double foodConsumption() {
		return weight*2;
	}

	public String doSound() {
		return "Huhuhuhuhuhu";
	}

	public String whoAmI() {
		return "Orangutan Kryšpín";
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	


}
