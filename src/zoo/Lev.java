package zoo;

public class Lev implements AnimalInterface {
	private double weight;
	
	
	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		return weight/2;
	}

	@Override
	public String doSound() {
		return "GRRRRR";
	}

	@Override
	public String whoAmI() {
		return "Lev";
	}

}
