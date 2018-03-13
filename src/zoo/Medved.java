package zoo;
/**
 * Tato tøída reprezentuje zvíøe medvìd.
 * Je do této tøídy implementovaný interface AnimalInterface
 * 
 * @author Vít Vágner
 *
 */
public class Medved implements AnimalInterface {
	
	private double weight;

	/**
	 * Tato metoda vrací hmotnost zvíøete
	 * 
	 * @return		double
	 */
	@Override
	public double getWeight() {
		return weight;
	}

	/**
	 * Metoda nastavuje hmotnost zvíøeti.
	 * Hmotnost nesmí být záporná èi nulová.
	 * 
	 * @param		weight váha, na kterou to chcete zmìnit
	 */
	@Override
	public void setWeight(int weight) {
		if(weight < 0) {
			System.out.println("Nejde zadat záporná èi nulová hmotnost.");
		}
		this.weight = weight;
	}

	/**
	 * Tato metoda urèujì spotøebu jídla na jeden den
	 * 
	 * @return		double
	 */
	@Override
	public double foodConsumption() {
		return weight * 3.5;
	}

	/**
	 * Metoda zastupuje, jaký zvíøe zvuk dìlá.
	 * 
	 * @return		String
	 */
	@Override
	public String doSound() {
		return "Brereererereh";
	}

	/**
	 * Metoda øíká co za zvíøe právì je.
	 * 
	 * @return		String
	 */
	@Override
	public String whoAmI() {
		return "BLACK BEARA";
	}

}
