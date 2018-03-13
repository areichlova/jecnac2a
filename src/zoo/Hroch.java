package zoo;

public class Hroch implements AnimalInterface {
	protected double weight;
	protected double delka;
	
	public Hroch(double we, double d) {
		super();
		// TODO Auto-generated constructor stub
		weight = we;
		delka = d;
	}
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}
	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}
	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return Math.log10(weight*delka);
	}
	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "UAFUIAUFAHUFAUA";
	}
	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Hroch Ferda";
	}
	
	
}
