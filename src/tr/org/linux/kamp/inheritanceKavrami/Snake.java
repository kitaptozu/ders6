package tr.org.linux.kamp.inheritanceKavrami;

public class Snake extends Reptile implements Herbivore,Carnivore{


	
	public Snake(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("Yılan avlandı! Bugün karnı tok!");
		
	}

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		System.out.println("Yılan avda başaramadı ve ota mahküm oldu!");
	}

	@Override
	void clawl() {
		// TODO Auto-generated method stub
		System.out.println("Yılan süründü!");
	}

}
