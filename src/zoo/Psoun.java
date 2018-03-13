
package zoo;

/**
 * @author glas
 * @version 1.0
 */
public class Psoun implements AnimalInterface{

	private double weight;
	private double foodperkilos;
	private String sound;
	private String identities;

	public Psoun(double weight, double foodperkilos, String sound, String identities){
		this.weight = weight;
		this.foodperkilos = foodperkilos;
		this.sound = sound;
		this.identities = identities;
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
		return weight/foodperkilos;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return sound;
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return identities;
	}

}
