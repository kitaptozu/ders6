package tr.org.linux.kamp.inheritanceKavrami;

public class Canary extends Bird implements Herbivore {
	
	

	public Canary(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		System.out.println("Ot çöp ile kanarya beslendi!");
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Kanarya uçarak gezip geldi!");
	}

	@Override
	void cikcik() {
		// TODO Auto-generated method stub
		System.out.println("Kanarya şarkı söyledi!");
		
	}

}
