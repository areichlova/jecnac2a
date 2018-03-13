package zoo;

public class Fenek implements AnimalInterface {

	private double weight;

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return weight*1.8;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return"woof woof";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Fenek";
	}

}
