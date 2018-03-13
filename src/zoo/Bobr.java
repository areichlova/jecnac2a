package zoo;

public class Bobr implements AnimalInterface{
private String name = "Bobr";
private double weight;
private String sound = "haf,haf";
private double foodConsumption;

public Bobr(String name, int weight, String sound, int foodConsumption){
this.weight=weight;

	this.foodConsumption = foodConsumption;
	
}
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
			this.weight=weight;
		}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return weight*5;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return sound;
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return name;
	}

}
