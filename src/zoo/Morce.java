package zoo;
/**
 * 
 * @author aleks
 *
 */
public class Morce implements AnimalInterface{
	private double weight;
	private String barva;
	
	public Morce(double weight, String barva) {
		this.weight = weight;
		this.barva = barva;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override

	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
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

	

	
	

}
