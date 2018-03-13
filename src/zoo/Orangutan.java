package zoo;

public class Orangutan implements AnimalInterface {

	private double weight;
	
	
	
	
	@Override
	public double getWeight() {
		
		return 0;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;
		
	}

	@Override
	public double foodConsumption() {
		
		return weight*2;
	}

	@Override
	public String doSound() {
		
		return "Random zvuk";
	}

	@Override
	public String whoAmI() {
		
		return "Kryšpín";
	}

}
