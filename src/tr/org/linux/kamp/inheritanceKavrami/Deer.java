package tr.org.linux.kamp.inheritanceKavrami;

public class Deer extends Mamma implements Herbivore{


	
	
	public Deer(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		System.out.println("Ot çöp yendi!");
	}


	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		System.out.println("Doğum yapıldı!");
	}



}
