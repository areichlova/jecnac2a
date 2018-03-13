package zoo;

public class Fenek implements AnimalInterface {

	private double weight;
	/*
	public Fenek(double weight) {
		this.weight = weight; 
	}

	public Fenek(double w) {
		super();
		// TODO Auto-generated constructor stub
		this.weight = w;
	}
	*/
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
