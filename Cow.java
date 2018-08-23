
public class Cow extends Animal implements MilkGivers, Pets, Pullers{

	@Override
	public int capacity() {
		return 20;
	}

	@Override
	public void carry() {
		System.out.println(" cow is carrying");
	}

	@Override
	public void giveMilk() {
		System.out.println("giving milk");
	}

	@Override
	public int produceMilkQuantity() {
		return 15;
	}

	@Override
	protected void sound() {
		System.out.println("moooooo");
	}

	@Override
	public void sleep() {

		System.out.println("cow is sleeping");
	}

	@Override
	public void eat() {
		System.out.println("cow is eating");
	}

}
