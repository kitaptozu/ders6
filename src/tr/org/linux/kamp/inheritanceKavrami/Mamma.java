package tr.org.linux.kamp.inheritanceKavrami;

public abstract class Mamma extends Animal{




	public Mamma(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	abstract void giveBirth();
	
}
