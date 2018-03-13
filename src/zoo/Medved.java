package zoo;

public class Medved implements AnimalInterface {
	
	private double weight;

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		if(weight < 0) {
			
		}
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		return 0;
	}

	@Override
	public String doSound() {
		return "";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return null;
	}

}
