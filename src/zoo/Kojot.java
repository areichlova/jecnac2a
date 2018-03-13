package zoo;

public class Kojot implements AnimalInterface {
private double weight;
private String name;
	
	public Kojot(double weight, String name) {
	this.weight =  weight;
	this.name = name;
}
 
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
		return weight/4;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "[Zvuk kojota]";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return name; 
	}

}
