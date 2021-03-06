package zoo;
/**
 * Tato t��da reprezentuje zv��e medv�d.
 * Je do t�to t��dy implementovan� interface AnimalInterface
 * 
 * @author V�t V�gner
 *
 */
public class Medved implements AnimalInterface {
	
	private String name = "BLACK BEARA";
	private double weight;
	private double height;
	
	public Medved(double weight, double height) {
		this.setWeight(weight);
		this.height = height;
	}
	

	/**
	 * Tato metoda vrac� hmotnost zv��ete
	 * 
	 * @return		double
	 */
	@Override
	public double getWeight() {
		return weight;
	}

	/**
	 * Metoda nastavuje hmotnost zv��eti.
	 * Hmotnost nesm� b�t z�porn� �i nulov�.
	 * 
	 * @param		weight v�ha, na kterou to chcete zm�nit
	 */
	@Override
	public void setWeight(double weight) {
		if(weight < 0) {
			System.out.println("Nejde zadat z�porn� �i nulov� hmotnost.");
		}
		this.weight = weight;
	}

	/**
	 * Tato metoda ur�uj� spot�ebu j�dla na jeden den
	 * 
	 * @return		double
	 */
	@Override
	public double foodConsumption() {
		return weight * 3.5;
	}

	/**
	 * Metoda zastupuje, jak� zv��e zvuk d�l�.
	 * 
	 * @return		String
	 */
	@Override
	public String doSound() {
		return "Brereererereh";
	}

	/**
	 * Metoda ��k�, jak se zv��e jmenuje.
	 * 
	 * @return		String
	 */
	@Override
	public String whoAmI() {
		return name;
	}

}
