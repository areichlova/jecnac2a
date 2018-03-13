package zoo;

public class Lemur implements AnimalInterface {
	
	private double weight;
	private int delkaOcasu;
	
	public Lemur(double weight , int delkaOcasu) {
		this.weight = weight;
		this.delkaOcasu = delkaOcasu;
	}
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
		return 4;
	}

	@Override
	public String doSound() {
		return "horrible sound";
	}

	@Override
	public String whoAmI() {
		return "lemur";
	}

}
