package zoo;

public class Kamzik implements AnimalInterface {
private double weight;
private double delkaParohu;
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}


	@Override
	public double foodConsumption() {
		return weight*delkaParohu*2;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "Nìco co dìlá kamzík";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Kamzík";
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
