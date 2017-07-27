package tr.org.linux.kamp.inheritanceKavrami;

public abstract class Animal {
	private String eyeColor;
	private String furColor;
	private int age;
	private String species;
	private String name;
	
	public Animal(String name,String eyeColor,String furColor,int age,String species) {
		setName(name);
		setEyeColor(eyeColor);
		setFurColor(furColor);
		setAge(age);
		setSpecies(species);
	}
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
}




