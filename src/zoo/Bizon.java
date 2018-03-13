package zoo;

public class Bizon implements AnimalInterface{
	private double weight;
	private int dotNumber;

	public Bizon(double weight, int dotNumber) {
		super();
		this.weight = weight;
		this.dotNumber = dotNumber;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
		this.weight =weight;
	} 

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "Buuuu, Buuuu!";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Bizon: ";
	}

}
