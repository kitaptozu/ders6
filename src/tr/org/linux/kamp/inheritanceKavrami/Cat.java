package tr.org.linux.kamp.inheritanceKavrami;

public class Cat extends Mamma implements Carnivore {


	
	public Cat(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("Güzel bir fare avlayıp, ziyafet çekti!");
	}

	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		System.out.println("Kedimiz doğum yaptı!");
	}
	
	void meow() {
		System.out.println(getName()+" miyavlıyor!");
	}


}
