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
	public void setWeight() {
		// TODO Auto-generated method stub
		this.weight = weight;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return weight*10;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "CHPRPRPRPRR";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Horse Fuchs";
	}

	@Override
	public void setWeight(double weight) {
		//TODO Auto-generated method stub
		
	}

}
