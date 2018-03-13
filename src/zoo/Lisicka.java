package zoo;

public class Lisicka implements AnimalInterface{
	private double weight;
	private int dotNumber;

	public Lisicka(double weight, int dotNumber) {
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
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return weight*1;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "Mrrrr";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Lisicka: ";
	} 

}
