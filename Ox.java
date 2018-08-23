
public class Ox extends Animal implements Pullers {

	@Override
	public int capacity() {
		return 200;
	}

	@Override
	public void carry() {
		System.out.println("ox is carring");
	}

	@Override
	protected void sound() {
		System.out.println("ox making a sound");
	}

}
