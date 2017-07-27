package tr.org.linux.kamp.inheritanceKavrami;

public class inheritanceTest {
	
	public static void main(String[] args) {
		Snake yilan = new Snake("Yılan", "kırmızı", "kahverengi", 2, "Kobra");
		
		System.out.println("Yılanın Adı: "+yilan.getName());
		System.out.println("Yılanın Göz Rengi: "+yilan.getEyeColor());
		System.out.println("Yılanın Deri Rengi: "+yilan.getFurColor());
		System.out.println("Yılanın Yaşı: "+yilan.getAge());
		System.out.println("Yılanın Türü: "+yilan.getSpecies());
		yilan.clawl();
		yilan.hunt();
		yilan.eatPlants();
		
		Cat sari = new Cat("Sarı","Sarı","Sarı",3,"Düz kedi");
		sari.hunt();
		sari.giveBirth();
		sari.meow();
		
	}
	
	
}
