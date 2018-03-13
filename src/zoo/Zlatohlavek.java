package zoo;

public class Zlatohlavek implements AnimalInterface {
	
	private double weight;
	private String rank;
	
	

	public Zlatohlavek(double weight, String rank) {
		super();
		this.weight = weight;
		this.rank = rank;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0.002;
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		this.weight=weight;
		
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return weight*1.5;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "Bzzz!";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Zlatohlavek";
	}

	
	
	
}
