
public class Dog extends Animal implements Pets,Pullers {
	String breed;

	@Override
	public int capacity() {
		return 5;
	}

	@Override
	public void carry() {
		System.out.println("dog is carrying");
	}

	@Override
	public void sleep() {
		System.out.println("zzzzzzzzzzzzzzzzzzz");
	}

	@Override
	public void eat() {
		System.out.println("eating");
	}

	@Override
	protected void sound() {
		System.out.println("bow wow");
	}

}
