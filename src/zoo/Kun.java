package zoo;

public class Kun implements AnimalInterface {
	private double weight;
	private int tail;

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return weight*10;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "CHPRPRPRPR";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Horse Fuchs";
	}

}
