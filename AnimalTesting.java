
import java.util.*;
public class AnimalTesting {

	public static void main(String[] args) {

		
		Cow cow = new Cow();
		System.out.println(cow.capacity());
		cow.giveMilk();
		cow.eat();
		cow.sleep();
		
		
		ArrayList<Animal> a = new ArrayList<Animal>();
		a.add(cow);
		a.add(new Cow());
		a.add(new Cow());
		a.add(new Dog());
		a.add(new Ox());
		System.out.println(a);
		Animal[] b = new Animal[7];
		
	  a.toArray(b);
	  for(int i =0;i<b.length; i++) {
		  System.out.println(b[i]);
	  }
	  
	  
		
	
	}
}
