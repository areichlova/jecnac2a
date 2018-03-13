package zoo;

public class Morce implements AnimalInterface{
	private double weight;
	private String barva;
	
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return weight*0.4;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "roof roof";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Krecek";
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}
	

}
