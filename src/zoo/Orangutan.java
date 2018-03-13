package zoo;

public class Orangutan implements AnimalInterface {

	private double weight;
	
	public double getWeight() {
		
		return 0;
	}

	public void setWeight(int weight) {
		this.weight = weight;
		
	}

	public double foodConsumption() {
		
		return weight*2;
	}

	public String doSound() {
		
		return "Random zvuk";
	}

	public String whoAmI() {
		
		return "Kryšpín";
	}

}
